package AlgoritmosEstruturaDeDados.Busca;

public class ArvoreBinariaBusca<T extends Comparable<T>> extends ArvoreBinariaAbstract<T> {

    public void inserir(T info) {
        raiz = inserir(raiz, info);
    }

    private NoArvoreBinaria<T> inserir(NoArvoreBinaria<T> no, T info) {
        if (no == null) {
            return new NoArvoreBinaria<T>(info);
        }
        if (info.compareTo(no.getInfo()) < 0) {
            no.setEsquerda(inserir(no.getEsquerda(), info));
        } else if (info.compareTo(no.getInfo()) > 0) {
            no.setDireita(inserir(no.getDireita(), info));
        }
        return no;
    }

    public NoArvoreBinaria<T> buscar(T info) {
        return buscar(raiz, info);
    }

    private NoArvoreBinaria<T> buscar(NoArvoreBinaria<T> no, T info) {
        if (no == null || no.getInfo().equals(info)) {
            return no;
        }
        if (info.compareTo(no.getInfo()) < 0) {
            return buscar(no.getEsquerda(), info);
        } else {
            return buscar(no.getDireita(), info);
        }
    }

    public T encontrarMinimo() {
        if (raiz == null)
            return null;
        NoArvoreBinaria<T> atual = raiz;
        while (atual.getEsquerda() != null) {
            atual = atual.getEsquerda();
        }
        return atual.getInfo();
    }

    public T encontrarMaximo() {
        if (raiz == null)
            return null;
        NoArvoreBinaria<T> atual = raiz;
        while (atual.getDireita() != null) {
            atual = atual.getDireita();
        }
        return atual.getInfo();
    }

    public int altura() {
        return altura(raiz);
    }

    private int altura(NoArvoreBinaria<T> no) {
        if (no == null)
            return -1;

        int alturaEsq = altura(no.getEsquerda());
        int alturaDir = altura(no.getDireita());

        // substituir Math.max por condicional
        if (alturaEsq > alturaDir) {
            return 1 + alturaEsq;
        } else {
            return 1 + alturaDir;
        }
    }

    public boolean estaBalanceada() {
        return estaBalanceada(raiz);
    }

    private boolean estaBalanceada(NoArvoreBinaria<T> no) {
        if (no == null)
            return true;

        int alturaEsq = altura(no.getEsquerda());
        int alturaDir = altura(no.getDireita());

        int diff = alturaEsq - alturaDir;
        if (diff < 0)
            diff = -diff; // substitui Math.abs

        return diff <= 1 && estaBalanceada(no.getEsquerda()) && estaBalanceada(no.getDireita());
    }

    public void remover(T info) {
        raiz = remover(raiz, info);
    }

    private NoArvoreBinaria<T> remover(NoArvoreBinaria<T> no, T info) {
        if (no == null)
            return null;

        if (info.compareTo(no.getInfo()) < 0) {
            no.setEsquerda(remover(no.getEsquerda(), info));
        } else if (info.compareTo(no.getInfo()) > 0) {
            no.setDireita(remover(no.getDireita(), info));
        } else {
            if (no.getEsquerda() == null)
                return no.getDireita();
            if (no.getDireita() == null)
                return no.getEsquerda();

            NoArvoreBinaria<T> sucessor = encontrarMin(no.getDireita());
            no.setInfo(sucessor.getInfo());
            no.setDireita(remover(no.getDireita(), sucessor.getInfo()));
        }
        return no;
    }

    private NoArvoreBinaria<T> encontrarMin(NoArvoreBinaria<T> no) {
        while (no.getEsquerda() != null)
            no = no.getEsquerda();
        return no;
    }

    public void remover2(T info) {
        raiz = remover2(raiz, info);
    }

    private NoArvoreBinaria<T> remover2(NoArvoreBinaria<T> no, T info) {
        if (no == null)
            return null;

        if (info.compareTo(no.getInfo()) < 0) {
            no.setEsquerda(remover2(no.getEsquerda(), info));
        } else if (info.compareTo(no.getInfo()) > 0) {
            no.setDireita(remover2(no.getDireita(), info));
        } else {
            // Caso 1: sem filhos ou só 1 filho
            if (no.getEsquerda() == null)
                return no.getDireita();
            if (no.getDireita() == null)
                return no.getEsquerda();

            // Caso 2: dois filhos — encontrar o menor da subárvore direita
            NoArvoreBinaria<T> atual = no.getDireita();
            while (atual.getEsquerda() != null) {
                atual = atual.getEsquerda();
            }

            // Substitui o valor do nó atual pelo do menor da direita
            no.setInfo(atual.getInfo());

            // Remove o nó duplicado na subárvore direita
            no.setDireita(remover2(no.getDireita(), atual.getInfo()));
        }

        return no;
    }

}
