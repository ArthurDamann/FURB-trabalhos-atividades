package AlgoritmosEstruturaDeDados.Ordenacao;

public class OrdenacaoMergeSort<T extends Comparable<T>> extends OrdenacaoAbstract<T> {
    @Override
    public void ordenar() {
        mergeSort(0, getInfo().length - 1);
    }

    private void mergeSort(int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(inicio, meio);
            mergeSort(meio + 1, fim);
            merge(inicio, meio, fim);
        }
    }

    private void merge(int inicio, int meio, int fim) {
        T[] info = getInfo();
        int tamEsq = meio - inicio + 1;
        int tamDir = fim - meio;

        @SuppressWarnings("unchecked")
        T[] esquerda = (T[]) new Comparable[tamEsq];
        @SuppressWarnings("unchecked")
        T[] direita = (T[]) new Comparable[tamDir];

        for (int i = 0; i < tamEsq; i++)
            esquerda[i] = info[inicio + i];
        for (int i = 0; i < tamDir; i++)
            direita[i] = info[meio + 1 + i];

        int cEsq = 0, cDir = 0, i = inicio;

        while (cEsq < tamEsq && cDir < tamDir) {
            if (esquerda[cEsq].compareTo(direita[cDir]) <= 0) {
                info[i++] = esquerda[cEsq++];
            } else {
                info[i++] = direita[cDir++];
            }
        }

        while (cEsq < tamEsq) {
            info[i++] = esquerda[cEsq++];
        }

        while (cDir < tamDir) {
            info[i++] = direita[cDir++];
        }
    }
}
