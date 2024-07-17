package lineares;

import java.util.Iterator;
// import java.lang.UnsupportedOperationException; // remover após implementar

/**
 * Classe a ser implementada para o trabalho 1.1
 */
public class FilaVetorIterable extends FilaVetor implements Iterable<Integer> {
    public Iterator<Integer> iterator() {
        return new FilaVetorIterator();
    }

    private class FilaVetorIterator implements Iterator<Integer> {
        private int posAtual;

        public FilaVetorIterator() {
            posAtual = f_pos;
        }

        public boolean hasNext() {
            return posAtual < b_pos;
        }

        public Integer next() {
            int atual = conteudo[posAtual];
            posAtual++;
            return atual;
        }
    }
}