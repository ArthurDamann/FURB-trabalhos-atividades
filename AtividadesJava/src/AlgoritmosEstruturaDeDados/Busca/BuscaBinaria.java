package AlgoritmosEstruturaDeDados.Busca;

public class BuscaBinaria extends BuscaAbstract {

    @Override
    public <T> int buscar(T valor) {
        if (!(valor instanceof Comparable)) {
            throw new IllegalArgumentException("O valor deve implementar Comparable.");
        }

        int inicio = 0;
        int fim = info.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            @SuppressWarnings("unchecked")
            int comparacao = ((Comparable<T>) info[meio]).compareTo(valor);

            if (comparacao == 0) {
                return meio;
            } else if (comparacao < 0) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }
}
