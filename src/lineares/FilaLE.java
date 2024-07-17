package lineares;

public class FilaLE implements Fila {
    protected ListaEncadeada conteudo;

    public FilaLE() {
        conteudo = new ListaEncadeada();
    }

    public void push(int n) {
        conteudo.inserirFim(n);
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