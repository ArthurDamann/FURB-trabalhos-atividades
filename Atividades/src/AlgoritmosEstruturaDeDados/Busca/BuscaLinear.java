package AlgoritmosEstruturaDeDados.Busca;

public class BuscaLinear extends BuscaAbstract {

    @Override
    public <T> int buscar(T valor) {
        for (int i = 0; i < info.length; i++) {
            if (valor.equals(info[i])) {
                return i;
            }
        }
        return -1; // Não encontrado
    }
}
