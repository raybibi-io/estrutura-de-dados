package primeiraLista.questao4;

public class FilaVetor<T> implements Fila<T> {
    private T[] vetor;
    private int tamanho;
    private int inicio;
    private int fim;

    @SuppressWarnings("unchecked")
    public FilaVetor(int capacidade) {
        vetor = (T[]) new Object[capacidade];
        tamanho = 0;
        inicio = 0;
        fim = 0;
    }

    @Override
    public void insere(T item) {
        if (tamanho == vetor.length) {
            throw new RuntimeException("Fila cheia");
        }
        vetor[fim] = item;
        fim = (fim + 1) % vetor.length;
        tamanho++;
    }

    @Override
    public T remove() {
        if (vazia()) {
            throw new RuntimeException("Fila vazia");
        }
        T item = vetor[inicio];
        vetor[inicio] = null;
        inicio = (inicio + 1) % vetor.length;
        tamanho--;
        return item;
    }

    @Override
    public boolean vazia() {
        return tamanho == 0;
    }

    @Override
    public T peek() {
        if (vazia()) {
            throw new RuntimeException("Fila vazia");
        }
        return vetor[inicio];
    }
}
