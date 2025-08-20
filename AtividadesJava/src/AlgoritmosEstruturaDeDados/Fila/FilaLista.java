package AlgoritmosEstruturaDeDados.Fila;

public class FilaLista<T> implements Fila<T> {

    private ListaFilaEncadeada<T> lista;

    public FilaLista() {
        lista = new ListaFilaEncadeada<>();
    }

    @Override
    public void inserir(T valor) {
        lista.inserirNoFinal(valor);
    }

    @Override
    public boolean estaVazia() {
        return lista.estaVazia();
    }

    @Override
    public T peek() {
        return lista.peek();
    }

    @Override
    public T retirar() {
        return lista.retirar();
    }

    @Override
    public void liberar() {
        lista.liberar();
    }

    
}

