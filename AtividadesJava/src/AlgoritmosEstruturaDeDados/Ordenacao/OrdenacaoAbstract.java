package AlgoritmosEstruturaDeDados.Ordenacao;

public abstract class OrdenacaoAbstract<T extends Comparable<T>> {
    private T[] info;

    public void setInfo(T[] info) {
        this.info = info;
    }

    public T[] getInfo() {
        return info;
    }

    public void trocar(int pos1, int pos2) {
        T temp = info[pos1];
        info[pos1] = info[pos2];
        info[pos2] = temp;
    }

    public abstract void ordenar();
}
