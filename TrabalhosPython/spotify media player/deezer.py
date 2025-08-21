import requests

# https://developers.deezer.com/api/track
# https://www.reddit.com/r/spotifyapi/comments/1hayp7j/30_second_preview_urls/

class DeezerAPI:
    BASE_URL = "https://api.deezer.com/search"

    def __init__(self, timeout=5):
        self.timeout = timeout

    def buscar_preview(self, nome: str, artista: str) -> str:
        """
        Busca o preview da faixa no Deezer combinando nome e artista.
        Retorna a URL do preview ou string vazia se não encontrar.
        """
        query = f"{nome} {artista}".replace(" ", "+")
        url = f"{self.BASE_URL}?q={query}"
        try:
            response = requests.get(url, timeout=self.timeout)
            if response.status_code != 200:
                print(f"Deezer API retornou status {response.status_code}")
                return ""
            data = response.json()
            for track in data.get("data", []):
                title = track.get("title", "").lower()
                artist_name = track.get("artist", {}).get("name", "").lower()
                if nome.lower() in title and artista.lower() in artist_name:
                    return track.get("preview", "")
        except Exception as e:
            print(f"Erro ao buscar preview Deezer: {e}")
        return ""
