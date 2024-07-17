package primeiraLista.questao3;

class Racional implements Comparable<Racional> {
    private int num;  // numerador
    private int den;  // denominador

    // Construtor
    public Racional(int num, int den) {
        if (den == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
        this.num = num;
        this.den = den;
    }

    // Método toString()
    @Override
    public String toString() {
        return num + "/" + den;
    }

    // Implementação do método compareTo()
    @Override
    public int compareTo(Racional o) {
        // Calcula a diferença entre this e o
        int thisNumerator = this.num * o.den;
        int otherNumerator = o.num * this.den;

        if (thisNumerator < otherNumerator) {
            return -1;
        } else if (thisNumerator > otherNumerator) {
            return 1;
        } else {
            return 0;
        }
    }
}
