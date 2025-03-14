package livros_lidos_pratica.Livraria_DesbravandoJava_e_Oritentacao_a_Objetos;

import livros_lidos_pratica.Livraria_DesbravandoJava_e_Oritentacao_a_Objetos.modelo.*;

public class DJOO {
    // --------------------------------------REGISTRO DE
    // VENDAS-------------------------------------

    /**
     * Este construtor é usado para testar e diminuir o numero de codigo na
     * Main.java
     * Basta apenas chama o construtor na main() que vai executar o codigo que esta
     * dentro do bloco.
     * LDOO sigla para o nome do livro lido e usado para estudar
     * DesbravandoJava_e_Oritentacao_a_Objetos
     * 
     */
    public DJOO() {
        // Objetos
        Autor autor1 = new Autor();

        autor1.setNome("George Ower");
        autor1.setCpf("777-777-777-00");
        autor1.setEmail("George@gmail.com");

        // SEMPRE USAR DEPOIS DA INSTACIA AUTOR TER SIGO POPULADA "INSERIDA OS VALORES
        // DE
        // AUTOR" - EVITOR PASSAR AUTOR NULO (NULL) PARA UM LIVRO, POIS TODos LIVROs TEM
        // 1 AUTOR
        // NAO É MAIS UM LIVRO GENERICO MAS SIM UM LIVRO FISICO
        Livro livrof = new LivroFisico(autor1);

        livrof.setNome("Cronicas de Narnia");
        livrof.setDescricao("Livro para adolescentes");
        livrof.setPreco(59.90);
        livrof.setIsbn("100-222-00");
        livrof.setAutor(autor1);

        livrof.mostrarDetalhes();

        // LIVRO DIGITAL
        Livro ebook = new Ebook(autor1);
        ebook.setPreco(29.90);
        ebook.setImpresso(false);

        // MINI - LIVRO
        Mini_Livro minil = new Mini_Livro(autor1);
        minil.setPreco(39.90);

        //Editora da revista
        Editora editora = new Editora();
        editora.setNomeFantasia("inova-mundo");
        editora.setRazaoSocial("brasil-investi");
        editora.setCnpj("000-000-");

        // REVISTA
        Revista revista = new Revista();
        revista.setNome("Agronegocio Mundial");
        revista.setDescricao("Informa como o globalismo está revolucionando o mercado mais movimentado nos ultimo 10 anos");
        revista.setEditora(editora);
        revista.setPreco(15.00);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionar(livrof);
        carrinho.adicionar(ebook);
        carrinho.adicionar(minil);
        carrinho.adicionar(revista);

        System.out.println("Total " + carrinho.getTotal());

    }
}
