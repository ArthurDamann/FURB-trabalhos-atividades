package AlgoritmosEstruturaDeDados.Busca;

public abstract class BuscaAbstract {
    protected Object[] info;

    public Object[] getInfo() {
        return info;
    }

    public void setInfo(Object[] info) {
        this.info = info;
    }

    public abstract <T> int buscar(T valor);
}
