package AlgoritmosEstruturaDeDados.MapaDeDispersao;

public class MapaDispersao<T> {
    private ListaEncadeada<NoMapa<T>> info[];

    @SuppressWarnings("unchecked")
    public MapaDispersao(int tamanho) {
        info = (ListaEncadeada<NoMapa<T>>[]) new ListaEncadeada<?>[tamanho];
    }

    
    private int calcularHash(int chave) {
        int hash = chave % info.length;
        return hash;
    }

    public void inserir(int chave, T dado) {
        int indice = calcularHash(chave);
        if (info[indice] == null) {
            info[indice] = new ListaEncadeada<>();
        }

        NoMapa<T> novoNo = new NoMapa<>();
        novoNo.setChave(chave);
        novoNo.setValor(dado);
        info[indice].inserir(novoNo);

    }

    public T buscar(int chave) {
        int indice = calcularHash(chave);
        if (info[indice] != null) {
            NoMapa<T> buscaNo = new NoMapa<>();
            buscaNo.setChave(chave);
            NoLista<NoMapa<T>> noAtual = info[indice].buscar(buscaNo);
            if (noAtual != null) {
                return noAtual.getInfo().getValor();
            }
        }
        return null;
    }

    public int buscar(T valor) {
        for (int i = 0; i < info.length; i++) {
            ListaEncadeada<NoMapa<T>> lista = info[i];
            if (lista != null && !lista.estaVazia()) {
                for (int j = 0; j < lista.obterComprimento(); j++) {
                    NoLista<NoMapa<T>> no = lista.obterNo(j);
                    if (no != null && valor.equals(no.getInfo().getValor())) {
                        return no.getInfo().getChave();
                    }
                }
            }
        }
        return -1; // não encontrado
    }

    public void remover(int chave) {
        int indice = calcularHash(chave);
        if (info[indice] != null) {
            NoMapa<T> buscaNo = new NoMapa<>();
            buscaNo.setChave(chave);
            info[indice].retirar(buscaNo);
            if (info[indice].estaVazia()) {
                info[indice] = null;
            }
        }
    }

    public double calcularFatorCarga() {
        int elementos = 0;
        for (ListaEncadeada<NoMapa<T>> lista : info) {
            if (lista != null) {
                elementos += lista.obterComprimento();
            }
        }
        return (double) elementos / info.length;
    }

    public boolean estaVazia() {
        for (ListaEncadeada<NoMapa<T>> lista : info) {
            if (lista != null && !lista.estaVazia()) {
                return false;
            }
        }
        return true;
    }

    public int tamanho() {
        int elementos = 0;
        for (ListaEncadeada<NoMapa<T>> lista : info) {
            if (lista != null) {
                elementos += lista.obterComprimento();
            }
        }
        return elementos;
    }

    public boolean contemChave(int chave) {
        return buscar(chave) != null;
    }

    public void limpar() {
        for (int i = 0; i < info.length; i++) {
            info[i] = null;
        }
    }

    public void imprimir() {
        for (int i = 0; i < info.length; i++) {
            System.out.print("Posição " + i + ": ");
            if (info[i] != null && !info[i].estaVazia()) {
                NoLista<NoMapa<T>> p = info[i].obterNo(0);
                while (p != null) {
                    System.out.print("[" + p.getInfo().getChave() + " -> " + p.getInfo().getValor() + "] ");
                    p = p.getProximo();
                }
            } else {
                System.out.print("vazio");
            }
            System.out.println();
        }
    }

    public void redimensionar() {
        int novoTamanho = info.length * 2;
        ListaEncadeada<NoMapa<T>>[] novoInfo = new ListaEncadeada[novoTamanho];

        for (int i = 0; i < info.length; i++) {
            ListaEncadeada<NoMapa<T>> lista = info[i];
            if (lista != null && !lista.estaVazia()) {
                for (int j = 0; j < lista.obterComprimento(); j++) {
                    NoLista<NoMapa<T>> no = lista.obterNo(j);
                    if (no != null) {
                        NoMapa<T> elemento = no.getInfo();
                        int novoIndice = elemento.getChave() % novoTamanho;
                        if (novoIndice < 0)
                            novoIndice = -novoIndice;
                        if (novoInfo[novoIndice] == null) {
                            novoInfo[novoIndice] = new ListaEncadeada<>();
                        }
                        NoMapa<T> novoNoMapa = new NoMapa<>();
                        novoNoMapa.setChave(elemento.getChave());
                        novoNoMapa.setValor(elemento.getValor());
                        novoInfo[novoIndice].inserir(novoNoMapa);
                    }
                }
            }
        }
        info = novoInfo;
    }

    // Redimensiona o vetor para garantir fator de carga exatamente 0,75
    public void redimensionarParaFatorCarga075() {
        int elementos = tamanho();
        int novoTamanho = (elementos * 100 + 74) / 75;

        if (novoTamanho <= info.length) {
            return; // Não precisa redimensionar
        }

        ListaEncadeada<NoMapa<T>>[] novoInfo = new ListaEncadeada[novoTamanho];

        for (int i = 0; i < info.length; i++) {
            ListaEncadeada<NoMapa<T>> lista = info[i];
            if (lista != null && !lista.estaVazia()) {
                for (int j = 0; j < lista.obterComprimento(); j++) {
                    NoLista<NoMapa<T>> no = lista.obterNo(j);
                    if (no != null) {
                        NoMapa<T> elemento = no.getInfo();
                        int novoIndice = elemento.getChave() % novoTamanho;
                        if (novoIndice < 0)
                            novoIndice = -novoIndice;
                        if (novoInfo[novoIndice] == null) {
                            novoInfo[novoIndice] = new ListaEncadeada<>();
                        }
                        NoMapa<T> novoNoMapa = new NoMapa<>();
                        novoNoMapa.setChave(elemento.getChave());
                        novoNoMapa.setValor(elemento.getValor());
                        novoInfo[novoIndice].inserir(novoNoMapa);
                    }
                }
            }
        }
        info = novoInfo;
    }

    public int[] obterChaves() {
        int[] chaves = new int[tamanho()];
        int idx = 0;
        for (int i = 0; i < info.length; i++) {
            ListaEncadeada<NoMapa<T>> lista = info[i];
            if (lista != null && !lista.estaVazia()) {
                for (int j = 0; j < lista.obterComprimento(); j++) {
                    NoLista<NoMapa<T>> no = lista.obterNo(j);
                    if (no != null) {
                        chaves[idx++] = no.getInfo().getChave();
                    }
                }
            }
        }
        return chaves;
    }

    public Object[] obterValores() {
        Object[] valores = new Object[tamanho()];
        int idx = 0;
        for (int i = 0; i < info.length; i++) {
            ListaEncadeada<NoMapa<T>> lista = info[i];
            if (lista != null && !lista.estaVazia()) {
                for (int j = 0; j < lista.obterComprimento(); j++) {
                    NoLista<NoMapa<T>> no = lista.obterNo(j);
                    if (no != null) {
                        valores[idx++] = no.getInfo().getValor();
                    }
                }
            }
        }
        return valores;
    }

    public boolean contemValor(T valor) {
        for (int i = 0; i < info.length; i++) {
            ListaEncadeada<NoMapa<T>> lista = info[i];
            if (lista != null && !lista.estaVazia()) {
                for (int j = 0; j < lista.obterComprimento(); j++) {
                    NoLista<NoMapa<T>> no = lista.obterNo(j);
                    if (no != null && valor.equals(no.getInfo().getValor())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
