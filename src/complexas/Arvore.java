public class Arvore {
    String vintecinco;

    Arvore exemplo = new Arvore();
    No dez = new No(10);
    exemplo.raiz =dez;
    No vintecinco = new No(25);
  dez.setEsquerda(vintecinco);
    No cinco = new No(5);
  vintecinco.setEsquerda(cinco);
  cinco.setEsquerda(new

    No(1));
  cinco.setDireita(new

    No(14));
  vintecinco.setDireita(new

    No(9));
  dez.setDireita(new

    No(42));
  dez.setDireita.setEsquerda(new

    No(30));

}
}