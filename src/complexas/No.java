public class No {

    public int val;
    public No esquerda;
    public No direita;
    public No visita;
    public No raiz;

    public No(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public No getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(No esquerda) {
    }

    public No getDireita() {
        return direita;
    }

    public void setDireita(No direita) {
    }

    public No getVisita() {
        return visita;
    }

    public void setVisita(No visita) {
        this.visita = visita;
    }

    public No getRaiz() {
        return raiz;
    }

    public void setRaiz(No raiz) {
        this.raiz = raiz;
    }

}