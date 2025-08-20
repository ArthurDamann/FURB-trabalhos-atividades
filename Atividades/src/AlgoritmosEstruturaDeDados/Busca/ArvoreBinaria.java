package AlgoritmosEstruturaDeDados.Busca;

public class ArvoreBinaria<T> extends ArvoreBinariaAbstract<T> {

    @Override
    public NoArvoreBinaria<T> buscar(T info) {
        return buscar(raiz, info);
    }

    private NoArvoreBinaria<T> buscar(NoArvoreBinaria<T> no, T info) {
        if (no == null) {
            return null;
        }
        if (no.getInfo().equals(info)) {
            return no;
        }
        NoArvoreBinaria<T> resultado = buscar(no.getEsquerda(), info);
        if (resultado == null) {
            resultado = buscar(no.getDireita(), info);
        }
        return resultado;
    }
}
