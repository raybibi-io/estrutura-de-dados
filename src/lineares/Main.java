package lineares;

public class Main {
    public static void main(String[] args) {
        Pilha pilha = new PilhaVetor();
        pilha.push(7);
        pilha.push(9);
        System.out.println("removido do final da fila: " + pilha.pop());
        pilha.push(42);
        pilha.push(15);
        for (int i = 0; i < 3; i++)
            System.out.println("removido do final da fila: " + pilha.pop());

        System.out.println();

        Fila fila = new FilaVetor();
        fila.push(7);
        fila.push(9);
        System.out.println("removido do topo da pilha: " + fila.pop());
        fila.push(42);
        fila.push(15);
        for (int i = 0; i < 3; i++)
            System.out.println("removido do topo da pilha: " + fila.pop());

        System.out.println();

        /**
         * Código de teste para o trabalho 1.1
         */

        PilhaVetorIterable pilha11 = new PilhaVetorIterable();
        pilha11.push(7);
        pilha11.push(9);
        pilha11.push(42);
        pilha11.push(15);
        for (int val : pilha11) {
            System.out.println("elemento da pilha: " + val);
        }

        FilaVetorIterable fila11 = new FilaVetorIterable();
        fila11.push(7);
        fila11.push(9);
        fila11.push(42);
        fila11.push(15);
        for (int val : fila11) {
            System.out.println("elemento da fila: " + val);
        }
    }
}