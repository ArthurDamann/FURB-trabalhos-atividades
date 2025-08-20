package AlgoritmosEstruturaDeDados.Fila;

public class ListaFilaEncadeada<T> {
    private NoListaFila<T> primeiro;
    private NoListaFila<T> ultimo;

    public ListaFilaEncadeada() {
        primeiro = null;
        ultimo = null;
    }

    public void inserirNoFinal(T valor) {
        NoListaFila<T> novo = new NoListaFila<>(valor);
        if (primeiro == null) {
            primeiro = novo;
            ultimo = novo;
        } else {
            ultimo.setProximo(novo);
            ultimo = novo;
        }
    }

    public T retirar() {
        if (primeiro == null)
            throw new IllegalStateException("Lista vazia");
        T valor = peek();
        primeiro = primeiro.getProximo();
        if (primeiro == null)
            ultimo = null;
        return valor;
    }

    public T peek() {
        if (primeiro == null)
            throw new IllegalStateException("Lista vazia");
        return primeiro.getInfo();
    }

    public boolean estaVazia() {
        return primeiro == null;
    }

    public void liberar() {
        primeiro = null;
        ultimo = null;
    }

    public void reverse() {
        NoListaFila<T> anterior = null;
        NoListaFila<T> atual = primeiro;
        NoListaFila<T> proximo;

        ultimo = primeiro;

        while (atual != null) {
            proximo = atual.getProximo();
            atual.setProximo(anterior);
            anterior = atual;
            atual = proximo;
        }

        primeiro = anterior;
    }

    public ListaFilaEncadeada<T> merge(ListaFilaEncadeada<T> outraLista) {
        ListaFilaEncadeada<T> listaMesclada = new ListaFilaEncadeada<>();

        NoListaFila<T> atual = this.primeiro;
        while (atual != null) {
            listaMesclada.inserirNoFinal(atual.getInfo());
            atual = atual.getProximo();
        }

        atual = outraLista.primeiro;
        while (atual != null) {
            listaMesclada.inserirNoFinal(atual.getInfo());
            atual = atual.getProximo();
        }

        return listaMesclada;
    }
}
