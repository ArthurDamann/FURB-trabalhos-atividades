package AlgoritmosEstruturaDeDados.Pilha;

public class ListaEncadeada<T> {
    private NoLista<T> primeiro; // Referência para o primeiro nó

    // Construtor
    public ListaEncadeada() {
        this.primeiro = null; // Inicializa a lista vazia
    }

    // Método para inserir um novo nó no início da lista
    public void inserir(T info) {
        NoLista<T> novo = new NoLista<>(info);
        novo.setProximo(primeiro);
        primeiro = novo;
    }

    // Método para verificar se a lista está vazia
    public boolean estaVazia() {
        return primeiro == null;
    }

    // Método para buscar um nó na lista
    public NoLista<T> buscar(T info) {
        NoLista<T> p = primeiro;
        while (p != null) {
            if (p.getInfo().equals(info)) {
                return p; // Retorna o nó encontrado
            }
            p = p.getProximo();
        }
        return null; // Retorna null se não encontrar
    }

    // Método para retirar um nó da lista
    public void retirar(T info) {
        NoLista<T> anterior = null;
        NoLista<T> p = primeiro;

        while (p != null && !p.getInfo().equals(info)) {
            anterior = p;
            p = p.getProximo();
        }

        if (p != null) { // Se o nó foi encontrado
            if (p == primeiro) {
                primeiro = p.getProximo(); // Remove o primeiro nó
            } else {
                anterior.setProximo(p.getProximo()); // Remove o nó do meio
            }
        }
    }

    // Método para obter o comprimento da lista
    public int obterComprimento() {
        int comprimento = 0;
        NoLista<T> p = primeiro;
        while (p != null) {
            comprimento++;
            p = p.getProximo();
        }
        return comprimento;
    }

    // Método para obter um nó em uma posição específica
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

    // Método para retornar a representação em string da lista
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
