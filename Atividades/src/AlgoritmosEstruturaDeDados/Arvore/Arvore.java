package AlgoritmosEstruturaDeDados.Arvore;

public class Arvore<T> {
    private NoArvore<T> raiz;

    public Arvore() {
        this.raiz = null;
    }

    public NoArvore<T> getRaiz() {
        return raiz;
    }

    public void setRaiz(NoArvore<T> raiz) {
        this.raiz = raiz;
    }

    @Override
    public String toString() {
        return obterRepresentacaoTextual(raiz);
    }

    public String obterRepresentacaoTextual(NoArvore<T> no) {
        if (no == null)
            return "";
        StringBuilder sb = new StringBuilder();
        sb.append("<").append(no.getInfo());
        NoArvore<T> filho = no.getPrimeiro();
        while (filho != null) {
            sb.append(obterRepresentacaoTextual(filho));
            filho = filho.getProximo();
        }
        sb.append(">");
        return sb.toString();
    }

    public boolean pertence(T info) {
        return pertence(raiz, info);
    }

    private boolean pertence(NoArvore<T> no, T info) {
        if (no == null)
            return false;
        if (no.getInfo().equals(info))
            return true;
        NoArvore<T> filho = no.getPrimeiro();
        while (filho != null) {
            if (pertence(filho, info))
                return true;
            filho = filho.getProximo();
        }
        return false;
    }

    public int contarNos() {
        return contarNos(raiz);
    }

    private int contarNos(NoArvore<T> no) {
        if (no == null)
            return 0;
        int count = 1;
        NoArvore<T> filho = no.getPrimeiro();
        while (filho != null) {
            count += contarNos(filho);
            filho = filho.getProximo();
        }
        return count;
    }

    public int contarNosFolha() {
        return contarNosFolha(raiz);
    }

    private int contarNosFolha(NoArvore<T> no) {
        if (no == null)
            return 0;
        if (no.getPrimeiro() == null)
            return 1; // Nó sem filhos é folha
        int count = 0;
        NoArvore<T> filho = no.getPrimeiro();
        while (filho != null) {
            count += contarNosFolha(filho);
            filho = filho.getProximo();
        }
        return count;
    }

    public int contarNosInternos() {
        return contarNosInternos(raiz);
    }

    private int contarNosInternos(NoArvore<T> no) {
        if (no == null || no.getPrimeiro() == null)
            return 0; // Nó sem filhos não é interno
        int count = 1; // Conta o nó atual
        NoArvore<T> filho = no.getPrimeiro();
        while (filho != null) {
            count += contarNosInternos(filho);
            filho = filho.getProximo();
        }
        return count;
    }

    public int altura() {
        return altura(raiz);
    }

    private int altura(NoArvore<T> no) {
        if (no == null)
            return -1; // Árvore vazia tem altura -1
        int maxAltura = -1;
        NoArvore<T> filho = no.getPrimeiro();
        while (filho != null) {
            maxAltura = Math.max(maxAltura, altura(filho));
            filho = filho.getProximo();
        }
        return 1 + maxAltura;
    }

    public int nivel(T info) {
        return nivel(raiz, info, 0);
    }

    private int nivel(NoArvore<T> no, T info, int nivelAtual) {
        if (no == null)
            return -1; // Retorna -1 se o elemento não for encontrado
        if (no.getInfo().equals(info))
            return nivelAtual;
        NoArvore<T> filho = no.getPrimeiro();
        while (filho != null) {
            int nivelFilho = nivel(filho, info, nivelAtual + 1);
            if (nivelFilho != -1)
                return nivelFilho;
            filho = filho.getProximo();
        }
        return -1;
    }

    public int somaNos() {
        return somaNos(raiz);
    }

    private int somaNos(NoArvore<T> no) {
        if (no == null)
            return 0;
        int soma = (Integer) no.getInfo(); // Supondo que T seja Integer
        NoArvore<T> filho = no.getPrimeiro();
        while (filho != null) {
            soma += somaNos(filho);
            filho = filho.getProximo();
        }
        return soma;
    }

    public String preOrdem() {
        return preOrdem(raiz);
    }

    private String preOrdem(NoArvore<T> no) {
        if (no == null)
            return "";
        StringBuilder sb = new StringBuilder();
        sb.append(no.getInfo()).append(" ");
        NoArvore<T> filho = no.getPrimeiro();
        while (filho != null) {
            sb.append(preOrdem(filho));
            filho = filho.getProximo();
        }
        return sb.toString();
    }

    public String posOrdem() {
        return posOrdem(raiz);
    }

    private String posOrdem(NoArvore<T> no) {
        if (no == null)
            return "";
        StringBuilder sb = new StringBuilder();
        NoArvore<T> filho = no.getPrimeiro();
        while (filho != null) {
            sb.append(posOrdem(filho));
            filho = filho.getProximo();
        }
        sb.append(no.getInfo()).append(" ");
        return sb.toString();
    }

    public String emOrdem() {
        return emOrdem(raiz);
    }

    private String emOrdem(NoArvore<T> no) {
        if (no == null)
            return "";
        StringBuilder sb = new StringBuilder();
        NoArvore<T> filho = no.getPrimeiro();
        if (filho != null) {
            sb.append(emOrdem(filho));
        }
        sb.append(no.getInfo()).append(" ");
        while (filho != null && filho.getProximo() != null) {
            sb.append(emOrdem(filho.getProximo()));
            filho = filho.getProximo();
        }
        return sb.toString();
    }
}
