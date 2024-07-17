// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
    public static void main(String[] args) {
        // BoxComLog minhaBox = new BoxComLog(); // erro! BoxComLog é uma interface, não
        // é instanciável
        BoxComLog minhaBox = new BoxLogString(); // podemos ter referências a interfaces (da mesma forma que podemos ter
        // referências a superclasses)
        minhaBox.guardar(3);
        System.out.println("Até agora foram guardados: " + minhaBox.imprimirLog());
        minhaBox.guardar(1);
        minhaBox.guardar(4);
        minhaBox.guardar(1);
        minhaBox.guardar(5);
        System.out.println("Até agora foram guardados: " + minhaBox.imprimirLog());

        BoxComLogExtra<String> minhaSegundaBox = new BoxLogStringExtra<String>();
        // para declarar interfaces e instanciar
        // classes com Generics, precisamos
        // escolher o tipo a ser usado... E eles
        // precisam ser compatíveis!
        minhaSegundaBox.guardar("The");
        System.out.println("Até agora foram guardados: " + minhaSegundaBox.imprimirLog());
        minhaSegundaBox.guardar("quick");
        minhaSegundaBox.guardar("brown");
        minhaSegundaBox.guardar("fox");
        minhaSegundaBox.guardar("jumps");
        minhaSegundaBox.guardar("over");
        minhaSegundaBox.guardar("the");
        minhaSegundaBox.guardar("lazy");
        minhaSegundaBox.guardar("dog");
        System.out.println("Até agora foram guardados: " + minhaSegundaBox.imprimirLog());
    }

    // @Test
    // void addition() {
    // assertEquals(2, 1 + 1);
    // }
}