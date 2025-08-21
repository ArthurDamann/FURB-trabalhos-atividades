from flask import Flask, request, redirect, session, url_for, jsonify, render_template
from spotipy import Spotify
from spotipy.oauth2 import SpotifyOAuth
from AI import gerar_descricao # type: ignore
from db import buscar_por_id, salvar_musica
from deezer import DeezerAPI

app = Flask(__name__)
app.secret_key = 'sua_chave_secreta_aqui'

CLIENT_ID = '09860508999b48d3b7980a8d9ae28854'
CLIENT_SECRET = 'cfa053c45a9c417bab73d00045e18b55'
REDIRECT_URI = 'http://127.0.0.1:8888/callback'
SCOPE = 'playlist-read-private user-read-private'

sp_oauth = SpotifyOAuth(
    client_id=CLIENT_ID,
    client_secret=CLIENT_SECRET,
    redirect_uri=REDIRECT_URI,
    scope=SCOPE,
)

deezer_api = DeezerAPI()

@app.route('/')
def login():
    auth_url = sp_oauth.get_authorize_url()
    return redirect(auth_url)

@app.route('/callback')
def callback():
    code = request.args.get('code')
    if not code:
        return "Erro: parâmetro 'code' não encontrado no callback", 400

    token_info = sp_oauth.get_access_token(code, as_dict=True)
    if not token_info or 'access_token' not in token_info:
        return "Erro ao obter token", 400

    session['access_token'] = token_info['access_token']
    return redirect(url_for('player'))

@app.route('/token')
def get_token():
    access_token = session.get('access_token')
    if not access_token:
        return jsonify({'error': 'No access token'}), 401
    return jsonify({'access_token': access_token})

@app.route('/player')
def player():
    if 'access_token' not in session:
        return redirect(url_for('login'))
    return render_template('player.html')

@app.route('/describe', methods=['POST'])
def describe_track():
    try:
        data = request.get_json()
        track_id = data.get('id')
        nome = data.get('name', '')
        artista = data.get('artist', '')
        album = data.get('album', '')

        if not track_id or not nome or not artista:
            return jsonify({'error': 'Dados insuficientes'}), 400

        existente = None
        try:
            existente = buscar_por_id(track_id)
        except Exception as e:
            print("Erro ao buscar música no banco:", e)

        if existente:
            return jsonify({
                'description': existente.get('descricao', 'Sem descrição'),
                'preview': existente.get('preview', '')
            })

        descricao = gerar_descricao(nome, artista, album)

        # Busca o preview no Deezer via classe DeezerAPI
        preview_url = deezer_api.buscar_preview(nome, artista)

        musica = {
            'id': track_id,
            'nome': nome,
            'artista': artista,
            'album': album,
            'descricao': descricao,
            'preview': preview_url
        }

        try:
            salvar_musica(musica)
        except Exception as e:
            print("Erro ao salvar música no banco:", e)

        return jsonify({'description': descricao, 'preview': preview_url})

    except Exception as e:
        print("Erro no /describe:", e)
        return jsonify({'error': 'Erro interno do servidor'}), 500

@app.route('/me/playlists')
def minhas_playlists():
    if 'access_token' not in session:
        return redirect(url_for('login'))

    sp = Spotify(auth=session['access_token'])
    playlists = sp.current_user_playlists(limit=20)
    return jsonify(playlists)

if __name__ == '__main__':
    app.run(port=8888, debug=True)
