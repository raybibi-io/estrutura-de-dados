package primeiraLista.questao3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Racional[] racionais = new Racional[20];

        // Preencher o vetor com 20 números racionais variados (positivos e negativos)
        racionais[0] = new Racional(1, 2);
        racionais[1] = new Racional(3, 4);
        racionais[2] = new Racional(-5, 6);
        racionais[3] = new Racional(7, -8);
        racionais[4] = new Racional(9, 10);
        racionais[5] = new Racional(11, 12);
        racionais[6] = new Racional(-13, 14);
        racionais[7] = new Racional(15, -16);
        racionais[8] = new Racional(17, 18);
        racionais[9] = new Racional(-19, 20);
        racionais[10] = new Racional(21, -22);
        racionais[11] = new Racional(23, 24);
        racionais[12] = new Racional(25, -26);
        racionais[13] = new Racional(-27, 28);
        racionais[14] = new Racional(29, -30);
        racionais[15] = new Racional(-31, 32);
        racionais[16] = new Racional(33, 34);
        racionais[17] = new Racional(-35, 36);
        racionais[18] = new Racional(37, 38);
        racionais[19] = new Racional(-39, 40);

        // Ordenar o vetor
        Arrays.sort(racionais);

        // Imprimir o vetor ordenado
        for (Racional r : racionais) {
            System.out.println(r);
        }
    }
}
