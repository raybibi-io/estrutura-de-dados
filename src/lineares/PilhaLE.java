package lineares;

public class PilhaLE implements Fila {
  protected ListaEncadeada conteudo;

  public PilhaLE() {
    conteudo = new ListaEncadeada();
  }

  public void push(int n) {
    conteudo.inserirInicio(n);
  }

  public int pop() throws IllegalStateException {
    if (size() == 0)
      throw new IllegalStateException("pop() não pode ser chamado se a fila estiver vazia");
    int frente = conteudo.valorInicio();
    conteudo.removerInicio();
    return frente;
  }

  public int get() {
    return conteudo.valorInicio();
  }

  public int size() {
    return conteudo.tamanho();
  }
}