public class PercursoPos(Arvore arvore) {
    PercursoPos(arvore.raiz);

    public static void percursoPosOrdem(No no) {
        if (no != null) {
            percursoPosOrdem(no.getEsquerda());
            percursoPosOrdem(no.getDireita());
            visita(no);
            System.out.println(no.getVal());
        }
    }

