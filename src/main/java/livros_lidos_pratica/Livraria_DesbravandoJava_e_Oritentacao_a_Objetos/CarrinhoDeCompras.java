package livros_lidos_pratica.Livraria_DesbravandoJava_e_Oritentacao_a_Objetos;

public class CarrinhoDeCompras {
    private double total;

    // Como qualquer outro tipo de livro é filhos (extensoes) da classe LIVRO.
    // Podemos usar o tipo Pai(superclasse) ja que os outros tipos de livro herdam
    // de Livro.
    // FORMA MAIS GENERICA, pela sua classe Pai - Esse recurso é chamado de
    // POLIMORFISMO.
    public void adicionar(Livro livro) {
        System.out.println("LIVRO ADICIONADO: "+ livro);
        livro.aplicarDescontoDe(0.106);
        total += livro.getPreco();
    }

    public double getTotal() {
        return total;
    }
}
