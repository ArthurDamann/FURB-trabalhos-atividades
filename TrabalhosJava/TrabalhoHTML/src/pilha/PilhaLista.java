package pilha;

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
        if (estaVazia()) {
            return null;
        }
        T info = lista.getPrimeiro().getInfo();
        lista.retirar(info);
        return info;
    }

    @Override
    public T peek() {
        if (lista.getPrimeiro() == null) {
            return null;
        }
        return lista.getPrimeiro().getInfo();
    }

    @Override
    public boolean estaVazia() {
        if(lista.getPrimeiro() == null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void liberar() {
          while(!estaVazia()) {
            pop();
          }
    }
    
}
