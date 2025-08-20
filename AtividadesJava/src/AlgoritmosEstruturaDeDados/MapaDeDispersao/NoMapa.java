package AlgoritmosEstruturaDeDados.MapaDeDispersao;

public class NoMapa<T> {
    private int chave;
    private T valor;

    public NoMapa() {
    }

    public int getChave() {
        return chave;
    }

    public void setChave(int chave) {
        this.chave = chave;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        NoMapa<?> other = (NoMapa<?>) obj;
        return this.chave == other.chave;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(chave);
    }

}
