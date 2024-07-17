package lineares;

import java.lang.Iterable;
import java.util.Iterator;
// import java.lang.UnsupportedOperationException; // remover após implementar

/**
 * Classe a ser implementada para o trabalho 1.1
 */
public class PilhaVetorIterable extends PilhaVetor implements Iterable<Integer> {
  private class PilhaVetorIterator implements Iterator<Integer> {
    private int posAtual;

    public PilhaVetorIterator() {
      posAtual = t_pos - 1;
    }

    public boolean hasNext() {
      return posAtual >= 0;
    }

    public Integer next() {
      int atual = conteudo[posAtual];
      posAtual--;
      return atual;
    }
  }

  public Iterator<Integer> iterator() {
    return new PilhaVetorIterator();
  }
}