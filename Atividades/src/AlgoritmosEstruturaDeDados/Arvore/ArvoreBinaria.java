package AlgoritmosEstruturaDeDados.Arvore;

public class ArvoreBinaria<T> {
    private NoArvoreBinaria<T> raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void setRaiz(NoArvoreBinaria<T> raiz) {
        this.raiz = raiz;
    }

    public boolean estaVazia() {
        if (this.raiz != null) {
            return false;
        } else {
            return true;
        }
    }

    public boolean pertence(T info) {
        return pertence(raiz, info);
    }

    private boolean pertence(NoArvoreBinaria<T> no, T info) {
        if (no == null) {
            return false;
        } else {
            return no.getInfo().equals(info)
                    || pertence(no.getEsquerda(), info)
                    || pertence(no.getDireita(), info);
        }
    }

    public boolean buscar(T info) {
        return buscar(raiz, info);
    }

    private boolean buscar(NoArvoreBinaria<T> no, T info) {
        if (no == null) {
            return false;
        }
        if (no.getInfo().equals(info)) {
            return true;
        }
        return buscar(no.getEsquerda(), info) || buscar(no.getDireita(), info);
    }

    @Override
    public String toString() {
        return arvorePre(raiz);
    }

    private String arvorePre(NoArvoreBinaria<T> no) {
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

    private int contarNos(NoArvoreBinaria<T> no) {
        if (no == null) {
            return 0;
        } else {
            return 1 + contarNos(no.getEsquerda()) + contarNos(no.getDireita());
        }
    }

    public int contarNosFolha() {
        return contarNosFolha(raiz);
    }

    private int contarNosFolha(NoArvoreBinaria<T> no) {
        if (no == null) {
            return 0;
        }
        if (no.getEsquerda() == null && no.getDireita() == null) {
            return 1;
        }
        return contarNosFolha(no.getEsquerda()) + contarNosFolha(no.getDireita());
    }

    public int contarNosInternos() {
        return contarNosInternos(raiz);
    }

    private int contarNosInternos(NoArvoreBinaria<T> no) {
        if (no == null || (no.getEsquerda() == null && no.getDireita() == null)) {
            return 0;
        }
        return 1 + contarNosInternos(no.getEsquerda()) + contarNosInternos(no.getDireita());
    }

    public int somaNos() {
        return somaNos(raiz);
    }

    private int somaNos(NoArvoreBinaria<T> no) {
        if (no == null) {
            return 0;
        }
        return (Integer) no.getInfo() + somaNos(no.getEsquerda()) + somaNos(no.getDireita());
    }

    public String preOrdem() {
        return preOrdem(raiz);
    }

    private String preOrdem(NoArvoreBinaria<T> no) {
        if (no == null) {
            return "";
        }
        return no.getInfo() + " " + preOrdem(no.getEsquerda()) + preOrdem(no.getDireita());
    }

    public String emOrdem() {
        return emOrdem(raiz);
    }

    private String emOrdem(NoArvoreBinaria<T> no) {
        if (no == null) {
            return "";
        }
        return emOrdem(no.getEsquerda()) + no.getInfo() + " " + emOrdem(no.getDireita());
    }

    public String posOrdem() {
        return posOrdem(raiz);
    }

    private String posOrdem(NoArvoreBinaria<T> no) {
        if (no == null) {
            return "";
        }
        return posOrdem(no.getEsquerda()) + posOrdem(no.getDireita()) + no.getInfo() + " ";
    }

    public int nivel(T info) {
        return nivel(raiz, info, 0);
    }

    private int nivel(NoArvoreBinaria<T> no, T info, int nivelAtual) {
        if (no == null) {
            return -1;
        }
        if (no.getInfo().equals(info)) {
            return nivelAtual;
        }
        int nivelEsquerda = nivel(no.getEsquerda(), info, nivelAtual + 1);
        if (nivelEsquerda != -1) {
            return nivelEsquerda;
        }
        return nivel(no.getDireita(), info, nivelAtual + 1);
    }
}
