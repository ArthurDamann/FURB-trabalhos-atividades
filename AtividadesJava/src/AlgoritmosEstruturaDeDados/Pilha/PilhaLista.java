package AlgoritmosEstruturaDeDados.Pilha;

public class PilhaLista<T> implements Pilha<T> {
    private ListaEncadeada<T> lista;

    public PilhaLista() {
        lista = new ListaEncadeada<>();
    }

    @Override
    public void push(T info) {
        lista.inserir(info);
    }

    @Override
    public T pop() {
        T info;
        info = peek();
        lista.retirar(info);

        return info;
    }

    @Override
    public T peek() {
        return lista.getPrimeiro().getInfo();
    }

    @Override
    public boolean estaVazia() {
        if (lista.getPrimeiro() == null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void liberar() {
        while (!estaVazia()) {
            pop();
        }
    }

    public void reverse() {
        ListaEncadeada<T> listaReversa = new ListaEncadeada<>();
        while (!estaVazia()) {
            listaReversa.inserir(pop());
        }
        lista = listaReversa;
    }

    public boolean equals(PilhaLista<T> outraPilha) {
        return lista.equals(outraPilha.lista);
    }
}
