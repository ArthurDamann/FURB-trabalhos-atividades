# AI.py
# https://huggingface.co/mistralai/Mixtral-8x7B-Instruct-v0.1

from huggingface_hub import InferenceClient

# Inicializa o cliente com o modelo Mixtral
client = InferenceClient(
    model="mistralai/Mixtral-8x7B-Instruct-v0.1",
    token="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"
)

def gerar_descricao(nome, artista, album):
    prompt = (
        f"<s>[INST] Crie uma descrição envolvente e interessante sobre a música '{nome}' "
        f"do artista '{artista}', presente no álbum '{album}'. [/INST]"
    )
    try:
        resposta = client.text_generation(
            prompt,
            max_new_tokens=200,
            temperature=0.7,
            top_p=0.9,
            stop_sequences=["</s>"]
        )
        return resposta.strip()
    except Exception as e:
        print("Erro na geração:", e)
        return "Não foi possível gerar a descrição da música."
