import primeiraLista.ContadorImpl;

import java.util.Random;

public class Main {
    public static void moedas(int valor) {
        ContadorImpl caras = new ContadorImpl("Caras");
        ContadorImpl coroas = new ContadorImpl("Coroas");
        Random random = new Random();

        for (int i = 0; i < valor; i++) {
            if (random.nextBoolean()) {
                caras.incrementa();
            } else {
                coroas.incrementa();
            }
        }

        System.out.println("Caras: " + caras.valor());
        System.out.println("Coroas: " + coroas.valor());
    }

    public static void main(String[] args) {
        moedas(10); // Teste com 10 lançamentos de moeda
    }
}
