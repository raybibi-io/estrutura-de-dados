package lineares;
/**
 * Esta versão da classe ListaEncadeada é funcionalmente igual à que
 * foi implementada em sala. Porém, algumas funcionalidades foram
 * trazidas para dentro da classe ListaEncadeada, para que o código
 * construído utilizando esta classe fique melhor modularizado.
 * Optou-se por incluir métodos para todas as ações simples e de uso
 * geral na operação de listas encadeadas: inserção e remoção no
 * início, inserção no fim, tamanho da lista).
 * Para outras operações, é uma decisão de projeto de código incluir
 * novos métodos para elas na classe ListaEncadeada ou implementar
 * estas operações em outras classes. A depender da operação, pode
 * ser necessário replicar a estrutura básica de uma lista encadeada
 * na outra classe (e com isso abdicar de utilizar a classe
 * ListaEncadeada como projetada aqui).
 */
public class ListaEncadeada {
    private No inicio; // primeiro nó da lista encadeada; demais acessados por aqui
    private No fim; // para diminuir complexidade de inserirFim
    private int tamanho;

    public ListaEncadeada() {
        inicio = null;
        fim = null;
        tamanho = 0;
    }

    public void inserirInicio(int novo) {
        No novoNo = new No(novo);
        novoNo.prox = inicio;
        if (fim == null) // lista estava vazia
            fim = novoNo;
        inicio = novoNo;
        tamanho++;
    }

    public void inserirFim(int novo) {
        if (fim == null)
            inserirInicio(novo);
        else {
            No novoNo = new No(novo);
            fim.prox = novoNo;
            tamanho++;
        }
    }

    public int valorInicio() {
        return inicio.val;
    }

    public void removerInicio() {
        inicio = inicio.prox;
        tamanho--;
    }

    public int tamanho() {
        return tamanho;
    }

    private class No {
        int val;
        No prox;

        No(int val) {
            this.val = val;
            prox = null; // desnecessário, mas incluído por clareza
        }
    }
}