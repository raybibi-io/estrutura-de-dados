package primeiraLista.questoes1e2;

public class ListaSimples implements Lista {
    private int[] array;

    public ListaSimples(int cap) {
        array = new int[cap];
    }

    @Override
    public void set(int val, int pos) {
        if (pos < 0 || pos >= array.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        array[pos] = val;
    }

    @Override
    public int get(int pos) {
        if (pos < 0 || pos >= array.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return array[pos];
    }
}
