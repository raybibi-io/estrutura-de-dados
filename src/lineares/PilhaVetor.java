package lineares;

public class PilhaVetor implements Pilha {
  static int CAP = 100;
  protected int[] conteudo;
  protected int t_pos;

  public PilhaVetor() {
    conteudo = new int[CAP];
    t_pos = 0;
  }

  public void push(int n) {
    conteudo[t_pos] = n;
    t_pos++;
  }

  public int pop() throws IllegalStateException {
    if (size() == 0)
      throw new IllegalStateException("pop() não pode ser chamado se a fila estiver vazia");
    t_pos--;
    return conteudo[t_pos];
  }

  public int get() {
    return conteudo[t_pos - 1];
  }

  public int size() {
    return t_pos;
  };
}