package AlgoritmosEstruturaDeDados.Pilha;

public class PilhaVetor<T> implements Pilha<T> {
    private Object[] info;
    private int limite;
    private int tamanho;

    public PilhaVetor(int limite) {
        this.limite = limite;
        this.info = new Object[limite];
        this.tamanho = 0;
    }

    @Override
    public void push(T info) {
        if (tamanho == limite) {
            throw new RuntimeException(" Capacidade esgotada da pilha");
        }
        this.info[tamanho] = info;
        tamanho++;
    }

    @SuppressWarnings("unchecked")
    public T peek() {
        return (T) info[tamanho - 1];
    }

    public T pop() {
        T valorRetirado = peek();

        tamanho--;
        return valorRetirado;
    }

    public boolean estaVazia() {
        if (tamanho == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void liberar() {
        while (!estaVazia()) {
            pop();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = tamanho - 1; i >= 0; i--) {
            sb.append(info[i]);
            if (i > 0) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    @SuppressWarnings("unchecked")
    public void concatenar(PilhaVetor<T> p) {
        if (this.tamanho + p.tamanho > this.limite) {
            throw new RuntimeException("Capacidade insuficiente para concatenar as pilhas");
        }

        Object[] elementosP = new Object[p.tamanho];

        for (int i = 0; i < p.tamanho; i++) {
            elementosP[i] = p.info[i];
        }

        for (int i = 0; i < p.tamanho; i++) {
            this.push((T) elementosP[i]);
        }
    }

    public boolean equals(PilhaVetor<T> outraPilha) {
        if (this.tamanho != outraPilha.tamanho) {
            return false;
        }
        for (int i = 0; i < tamanho; i++) {
            if (!this.info[i].equals(outraPilha.info[i])) {
                return false;
            }
        }
        return true;
    }

    public void reverse() {
        for (int i = 0; i < tamanho / 2; i++) {
            Object temp = info[i];
            info[i] = info[tamanho - 1 - i];
            info[tamanho - 1 - i] = temp;
        }
    }

}
