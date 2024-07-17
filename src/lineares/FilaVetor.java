package lineares;

public class FilaVetor implements Fila {
    static int CAP = 100;
    protected int[] conteudo;
    protected int f_pos, b_pos;

    public FilaVetor() {
        conteudo = new int[CAP];
        f_pos = 0;
        b_pos = 0;
    }

    public void push(int n) {
        conteudo[b_pos] = n;
        b_pos++;
    }

    public int pop() throws IllegalStateException {
        if (size() == 0)
            throw new IllegalStateException("pop() não pode ser chamado se a fila estiver vazia");
        int frente = conteudo[f_pos];
        f_pos++;
        return frente;
    }

    public int get() {
        return conteudo[f_pos];
    }

    public int size() {
        return b_pos - f_pos;
    }
}