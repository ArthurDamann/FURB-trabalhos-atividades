package AlgoritmosEstruturaDeDados.Busca;

public abstract class ArvoreBinariaAbstract<T> {
    protected NoArvoreBinaria<T> raiz;

    public ArvoreBinariaAbstract() {
        this.raiz = null;
    }

    public void setRaiz(NoArvoreBinaria<T> raiz) {
        this.raiz = raiz;
    }

    public NoArvoreBinaria<T> getRaiz() {
        return raiz;
    }

    public boolean estaVazia() {
        return raiz == null;
    }

    public boolean pertence(T info) {
        return buscar(info) != null;
    }

    public abstract NoArvoreBinaria<T> buscar(T info);

    public String toString() {
        return arvorePre(raiz);
    }

    protected String arvorePre(NoArvoreBinaria<T> no) {
        if (no == null) {
            return "<>";
        } else {
            return "<" + no.getInfo() +
                    arvorePre(no.getEsquerda()) +
                    arvorePre(no.getDireita()) + ">";
        }
    }

    public int contarNos() {
        return contarNos(raiz);
    }

    protected int contarNos(NoArvoreBinaria<T> no) {
        if (no == null)
            return 0;
        return 1 + contarNos(no.getEsquerda()) + contarNos(no.getDireita());
    }
}
