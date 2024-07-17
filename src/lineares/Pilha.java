package lineares;
/**
 * A interface Pilha representa o tipo abstrato de dados conhecido
 * como pilha (em inglês, Stack). Nesta estrutura, podemos inserir
 * e remover objetos de um determinado tipo, com uma restrição
 * fundamental: o objeto que foi adicionado à pilha há menos tempo
 * precisa ser o primeiro a ser removido. Visualize esta lógica como,
 * literalmente, uma pilha de pratos. Cada prato entra em cima dos
 * anteriores, no _topo_ da pilha, e antes de retirar qualquer prato
 * do _meio_ da pilha, precisamos retirar os que estão em cima dele.
 *
 * Os dois métodos principais, que devem implementar esta lógica, são
 * push(), que adiciona um objeto novo no topo da pilha, e pop(), que
 * remove e retorna o objeto atualmente no topo da pilha. pop() não
 * deve ser chamado se a pilha estiver vazia e, se isso acontecer, um
 * erro deve ser produzido (nesta especificação, utilizamos uma
 * IllegalStateException).
 * 
 * Nesta versão de Pilha, os objetos armazenados obrigatoriamente
 * serão números do tipo int.
 *
 * Discussão: é possível criarmos interfaces mais elaboradas, com mais
 * protótipos de métodos consistentes com a lógica de funcionamento da
 * pilha. Isto tem o benefício de padronizar os protótipos destes
 * métodos e, com isso, permitir que criemos algoritmos que utilizem
 * esses métodos. Note que qualquer cliente da nossa interface, isto é,
 * qualquer desenvolvedor que crie uma classe que a implemente já
 * consegue usar, automaticamente, qualquer algoritmo que só dependa
 * da interface, e não da classe específica que ele desenvolveu. Porém,
 * quanto colocamos mais métodos na nossa interface, dificultamos o
 * trabalho desse cliente, que precisa escrever mais métodos para
 * satisfazer a esse maior nível de "exigência". É importante ter um
 * equilíbrio, incluir protótipos interessantes que tornem a interface
 * útil e simplifiquem o código dos nossos clientes, sem tornar a
 * interface "pesada" demais de implementar. Este equilíbrio deve ser
 * avaliado caso a caso. Finalmente, é importante ressaltar que
 * qualquer método adicional deve respeitar as regras da Pilha. Não
 * podemos, por exemplo, criar protótipos para remover elementos do
 * meio da Pilha, senão a interface deixa de ser útil!
 *
 * Nesta versão de Pilha, optamos por acrescentar apenas dois métodos
 * adicionais: o método get(), que retorna o elemento do topo sem
 * removê-lo, e o método size(), que retorna a quantidade de elementos
 * que a pilha contém atualmente.
 */
public interface Pilha {
  /**
   * push adiciona um novo objeto no topo da pilha.
   * 
   * @param n O novo objeto a ser adicionado
   */
  public void push(int n);

  /**
   * O método pop remove e retorna o objeto atualmente no topo da
   * pilha. Caso a pilha esteja vazia, uma IllegalStateException é
   * gerada.
   * 
   * @return O objeto atual no topo da pilha;
   */
  public int pop() throws IllegalStateException;

  /**
   * O método get retorna o objeto atualmente no topo da
   * pilha. Caso a pilha esteja vazia, uma IllegalStateException é
   * gerada. Seu comportamento é análogo ao de pop(), mas o estado
   * da pilha não deve ser modificado pela chamada a get().
   * 
   * @return O objeto atual no topo da pilha;
   */
  public int get() throws IllegalStateException;

  /**
   * O método size retorna a quantidade de elementos atualmente
   * armazenados na pilha. Para cada objeto adicionado (via push), o
   * valor retornado por size() deve aumentar em 1, e para cada objeto
   * removido (via pop), o valor retornado deve diminuir em 1.
   */
  public int size();
}