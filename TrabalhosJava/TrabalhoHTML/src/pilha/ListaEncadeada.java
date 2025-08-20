package pilha;

public class ListaEncadeada<T> {
    private NoLista<T> primeiro;

    // Construtor
    public ListaEncadeada() {
        this.primeiro = null;
    }

    public void inserir(T info) {
        NoLista<T> novo = new NoLista<>(info);
        novo.setProximo(primeiro);
        primeiro = novo;
    }

    public boolean estaVazia() {
        return primeiro == null;
    }

    public NoLista<T> buscar(T info) {
        NoLista<T> p = primeiro;
        while (p != null) {
            if (p.getInfo().equals(info)) {
                return p;
            }
            p = p.getProximo();
        }
        return null;
    }

    public void retirar(T info) {
        NoLista<T> anterior = null;
        NoLista<T> p = primeiro;

        while (p != null && !p.getInfo().equals(info)) {
            anterior = p;
            p = p.getProximo();
        }

        if (p != null) {
            if (p == primeiro) {
                primeiro = p.getProximo();
            } else {
                anterior.setProximo(p.getProximo());
            }
        }
    }

    public int obterComprimento() {
        int comprimento = 0;
        NoLista<T> p = primeiro;
        while (p != null) {
            comprimento++;
            p = p.getProximo();
        }
        return comprimento;
    }

    public NoLista<T> obterNo(int posicao) {
        if (posicao < 0 || posicao >= obterComprimento()) {
            throw new IndexOutOfBoundsException("Posição inválida");
        }
        NoLista<T> p = primeiro;
        for (int i = 0; i < posicao; i++) {
            p = p.getProximo();
        }
        return p;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        NoLista<T> p = primeiro;
        while (p != null) {
            sb.append(p.getInfo());
            if (p.getProximo() != null) {
                sb.append(", ");
            }
            p = p.getProximo();
        }
        return sb.toString();
    }

    public NoLista<T> getPrimeiro() {
        return primeiro;
    }
}