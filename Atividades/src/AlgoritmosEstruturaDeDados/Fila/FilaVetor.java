package AlgoritmosEstruturaDeDados.Fila;

public class FilaVetor<T> implements Fila<T> {

    private Object[] info;
    private int limite;
    private int tamanho;
    private int inicio;

    public FilaVetor(int limite) {
        this.limite = limite;
        this.info = new Object[limite];
        this.tamanho = 0;
        this.inicio = 0;
    }

    @Override
    public void inserir(T valor) {
        if (tamanho == limite) {
            throw new RuntimeException("Fila cheia");
        }
        int posicao = (inicio + tamanho) % limite;
        info[posicao] = valor;
        tamanho++;
    }

    @Override
    public boolean estaVazia() {
        if (tamanho == 0) {
            return true;
        } else {
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public T peek() {
        if (estaVazia()) {
            throw new RuntimeException("Fila vazia");
        }
        return (T) info[inicio];
    }

    @SuppressWarnings("unchecked")
    @Override
    public T retirar() {
        if (estaVazia()) {
            throw new RuntimeException("Fila vazia");
        }
        T valor = (T) info[inicio];
        info[inicio] = null;
        inicio = (inicio + 1) % limite;
        tamanho--;
        return valor;
    }

    @Override
    public void liberar() {
        for (int i = 0; i < tamanho; i++) {
            info[i] = null;
        }
        tamanho = 0;
        inicio = 0;
    }

    @SuppressWarnings("unchecked")
    public FilaVetor<T> criarFilaConcatenada(FilaVetor<T> f2) {
        FilaVetor<T> filaConcatenada = new FilaVetor<>(this.limite + f2.limite);
        for (int i = 0; i < this.tamanho; i++) {
            filaConcatenada.inserir((T) this.info[(inicio + i) % limite]);
        }
        for (int i = 0; i < f2.tamanho; i++) {
            filaConcatenada.inserir((T) f2.info[(f2.inicio + i) % f2.limite]);
        }
        return filaConcatenada;
    }

    public boolean equals(FilaVetor<T> outraFila) {
        if (this.tamanho != outraFila.tamanho) {
            return false;
        }
        for (int i = 0; i < tamanho; i++) {
            if (!this.info[(inicio + i) % limite].equals(outraFila.info[(outraFila.inicio + i) % outraFila.limite])) {
                return false;
            }
        }
        return true;
    }

    public void reverse() {
        for (int i = 0; i < tamanho / 2; i++) {
            int pos1 = (inicio + i) % limite;
            int pos2 = (inicio + tamanho - 1 - i) % limite;
            Object temp = info[pos1];
            info[pos1] = info[pos2];
            info[pos2] = temp;
        }
    }

    public boolean contains(T elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (info[(inicio + i) % limite].equals(elemento)) {
                return true;
            }
        }
        return false;
    }

    @SuppressWarnings("unchecked")
    public FilaVetor<T>[] split() {
        int mid = tamanho / 2;
        FilaVetor<T> fila1 = new FilaVetor<>(mid);
        FilaVetor<T> fila2 = new FilaVetor<>(tamanho - mid);

        for (int i = 0; i < mid; i++) {
            fila1.inserir((T) info[(inicio + i) % limite]);
        }
        for (int i = mid; i < tamanho; i++) {
            fila2.inserir((T) info[(inicio + i) % limite]);
        }

        return new FilaVetor[] { fila1, fila2 };
    }

    public void rotate(int n) {
        n = n % tamanho; // Garante que n esteja dentro do tamanho da fila
        if (n < 0) {
            n += tamanho; // Converte rotações negativas para positivas
        }

        for (int i = 0; i < n; i++) {
            T temp = retirar();
            inserir(temp);
        }
    }

    @SuppressWarnings("unchecked")
    public void removeDuplicates() {
        FilaVetor<T> novaFila = new FilaVetor<>(limite);
        for (int i = 0; i < tamanho; i++) {
            T elemento = (T) info[(inicio + i) % limite];
            if (!novaFila.contains(elemento)) {
                novaFila.inserir(elemento);
            }
        }
        this.info = novaFila.info;
        this.tamanho = novaFila.tamanho;
        this.inicio = novaFila.inicio;
    }
}
