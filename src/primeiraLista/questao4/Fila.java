package primeiraLista.questao4;

public interface Fila<T> {
    void insere(T item);

    T remove();

    boolean vazia();

    T peek();
}
