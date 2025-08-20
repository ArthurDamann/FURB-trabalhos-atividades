package AlgoritmosEstruturaDeDados.Fila;

public class NoListaFila<T> {
    private T info;
    private NoListaFila<T> proximo;

    // Construtor
    public NoListaFila(T info) {
        this.info = info;
        this.proximo = null;
    }

    // Getters e Setters
    public T getInfo() {
        return info;
    }

    public NoListaFila<T> getProximo() {
        return proximo;
    }

    public void setProximo(NoListaFila<T> proximo) {
        this.proximo = proximo;
    }

    public void setInfo(T info) {
        this.info = info;
    }
}
