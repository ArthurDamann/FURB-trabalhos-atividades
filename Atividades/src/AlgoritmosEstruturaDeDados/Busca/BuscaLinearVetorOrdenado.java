package AlgoritmosEstruturaDeDados.Busca;

public class BuscaLinearVetorOrdenado extends BuscaAbstract {

    @Override
    public <T> int buscar(T valor) {
        if (!(valor instanceof Comparable)) {
            throw new IllegalArgumentException("O valor deve implementar Comparable.");
        }

        for (int i = 0; i < info.length; i++) {
            @SuppressWarnings("unchecked")
            int comparacao = ((Comparable<T>) info[i]).compareTo(valor);

            if (comparacao == 0) {
                return i;
            } else if (comparacao > 0) {
                break; // Como está ordenado, pode parar
            }
        }
        return -1;
    }
}
