// percurso:meta-algoritmo que realiza uma operação(visita) em todos os nós da
// arvore
// pré-ordem: visita um pai antes de seus filhos

public class PercursoPre(Arvore arvore) {
    PercursoPre(arvore.raiz);

    public static void percursoPreOrdem(No no) {
        if (no != null) {
            visita(no);
            percursoPreOrdem(no.getEsquerda());
            percursoPreOrdem(no.getDireita());
            System.out.println(no.getVal());
        }
    }
}
