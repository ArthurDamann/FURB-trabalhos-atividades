package AlgoritmosEstruturaDeDados.Pilha;

public class NoLista<T> {
    private T info;
    private NoLista<T> proximo;

    // Construtor
    public NoLista(T info) {
        this.info = info;
        this.proximo = null;
    }

    // Getters e Setters
    public T getInfo() {
        return info;
    }

    public NoLista<T> getProximo() {
        return proximo;
    }

    public void setProximo(NoLista<T> proximo) {
        this.proximo = proximo;
    }
}
