package primeiraLista.questao4;

public class Main {
    public static void main(String[] args) {
        FilaVetor<Integer> fila = new FilaVetor<>(5);

        fila.insere(1);
        fila.insere(2);
        fila.insere(3);
        fila.insere(4);
        fila.insere(5);

        System.out.println("Elemento removido: " + fila.remove()); // 1
        System.out.println("Elemento removido: " + fila.remove()); // 2

        fila.insere(6);
        fila.insere(7);

        System.out.println("Primeiro elemento: " + fila.peek()); // 3

        while (!fila.vazia()) {
            System.out.println("Elemento removido: " + fila.remove());
        }
    }
}
