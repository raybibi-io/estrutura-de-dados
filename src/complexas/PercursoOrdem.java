public static void percursoOrdem(No no) {
    if (no != null) {
        percursoEmOrdem(no.getEsquerda());
        visita(no);
        percursoEmOrdem(no.getDireita());

        System.out.println(no.getVal());
    }
}
