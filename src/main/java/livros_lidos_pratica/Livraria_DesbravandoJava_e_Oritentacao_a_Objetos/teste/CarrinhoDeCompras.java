package livros_lidos_pratica.Livraria_DesbravandoJava_e_Oritentacao_a_Objetos.teste;

import livros_lidos_pratica.Livraria_DesbravandoJava_e_Oritentacao_a_Objetos.produtos.*;;

public class CarrinhoDeCompras {
    private double total;

    /**
     * Como outras classes de produtos (como livros e revistas) herdam da classe Produto,
     * podemos utilizar o tipo Produto (superclasse) para representá-las (referenciá-las).
     * Esse conceito é conhecido como POLIMORFISMO, permitindo que objetos de diferentes
     * subclasses sejam tratados de forma genérica pela classe Pai.
     */
    public void adicionar(Produto produto) {
        System.out.println("PRODUTO ADICIONADO: " + produto.getClass().getSimpleName());
        total += produto.getPreco();
    }

    public double getTotal() {
        return total;
    }
}
