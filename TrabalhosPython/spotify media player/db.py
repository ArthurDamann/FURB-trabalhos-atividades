from pymongo import MongoClient

MONGO_URI = "mongodb+srv://arthur:1234@spotifyapi.4liolys.mongodb.net/?retryWrites=true&w=majority&appName=SpotifyAPI"

client = MongoClient(MONGO_URI)
db = client.spotifydb
musicas = db.musicas

def buscar_por_id(music_id):
    return musicas.find_one({"id": music_id})

def salvar_musica(dados):
    musicas.update_one(
        {"id": dados["id"]},
        {"$set": dados},
        upsert=True
    )
