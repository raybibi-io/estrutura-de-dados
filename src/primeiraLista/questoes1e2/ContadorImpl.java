package primeiraLista.questoes1e2;

public class ContadorImpl implements Contador {
    private int count;
    private String id;

    public ContadorImpl(String id) {
        this.id = id;
        this.count = 0;
    }

    @Override
    public void incrementa() {
        count++;
    }

    @Override
    public int valor() {
        return count;
    }

    @Override
    public String toString() {
        return "primeiraLista.questoes1e2.Contador{" +
                "id='" + id + '\'' +
                ", count=" + count +
                '}';
    }
}
