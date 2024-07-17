package primeiraLista.questoes1e2;

public class ListaExpansivel implements Lista {
    private int[] array;

    public ListaExpansivel(int cap) {
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

    public void expandir(int novaCap) {
        int[] novoArray = new int[novaCap];
        System.arraycopy(array, 0, novoArray, 0, array.length);
        array = novoArray;
    }
}
