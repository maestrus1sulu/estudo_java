package livros_lidos_pratica.Livraria_DesbravandoJava_e_Oritentacao_a_Objetos.teste;

import livros_lidos_pratica.Livraria_DesbravandoJava_e_Oritentacao_a_Objetos.livraria.*;
import livros_lidos_pratica.Livraria_DesbravandoJava_e_Oritentacao_a_Objetos.produtos.*;

public class DJOO {
    // -------------REGISTRO DE VENDAS------------

   /**
     * Construtor utilizado para testar e reduzir a quantidade de código na classe Main.java.
     * Ao chamar este construtor dentro da main(), o código contido neste bloco será executado.
     * 
     * Sigla DJOO refere-se ao livro "Desbravando Java e Orientação a Objetos".
     */
    public DJOO() {
        // Criando e populando o autor
        Autor autor1 = new Autor();
        autor1.setNome("George Ower");
        autor1.setCpf("777-777-777-00");
        autor1.setEmail("George@gmail.com");

       
        // ---------------------------- LIVROS ----------------------------
        // É fundamental que o autor seja populado antes de ser passado para os livros,
        // evitando a possibilidade de um livro sem autor.
        /**
         * vantagem: simples e direto
         * desvantagem: depende diretamente da implementação LivroFisico, reduzindo a
         * flexibilidade quando era usado Livro na declaração
         * 
         * poderia usar outras formas mas teria que fazer casting ou apenas permitiria
         * chamar metodos definidos na interface caso desclara-se como tal interface
         * como por exemplo: Promocional
         */

        // Livro Físico
        LivroFisico livrof = new LivroFisico(autor1);

        livrof.setNome("Cronicas de Narnia");
        livrof.setDescricao("Livro para adolescentes");
        livrof.setPreco(59.90);
        livrof.setIsbn("100-222-00");
        livrof.setAutor(autor1);

        livrof.mostrarDetalhes();

        // Livro Digital (E-book)
        Livro ebook = new Ebook(autor1);
        ebook.setNome("Resumo Nárnia");
        ebook.setDescricao("Resumo do livro Crônicas de Nárnia");
        ebook.setPreco(29.90);
        ebook.setImpresso(false);
        ebook.setIsbn("100-00-000-");
        ebook.setAutor(autor1);

        ebook.mostrarDetalhes();

        // MINI - LIVRO
        Mini_Livro minil = new Mini_Livro(autor1);
        minil.setNome("");
        minil.setDescricao("");
        minil.setIsbn("00-00-000-000");
        minil.setAutor(autor1);
        minil.setPreco(39.90);

        minil.mostrarDetalhes();

        // ---------------------------- REVISTA ----------------------------
        // Criando e populando a editora
        Editora editora = new Editora();
        editora.setNomeFantasia("Inova-Mundo");
        editora.setRazaoSocial("Brasil Investi");
        editora.setCnpj("000-000-");

        // Criando e populando a revista
        Revista revista = new Revista();
        revista.setNome("Agronegócio Mundial");
        revista.setDescricao("Impactos do globalismo no mercado agrícola nos últimos 10 anos");
        revista.setEditora(editora);
        revista.setPreco(15.00);

        // ---------------------------- CARRINHO DE COMPRAS ----------------------------
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        
        // Aplicando desconto no livro físico, se possível
        if (livrof.aplicarDescontoDe10Porcento()) {
            System.out.println("Desconto aplicado! Novo valor: " + livrof.getPreco()+"\n");
        }
        
        // Adicionando itens ao carrinho
        carrinho.adicionar(livrof);
        carrinho.adicionar(ebook);
        carrinho.adicionar(minil);
        carrinho.adicionar(revista);
        
        // Exibindo o total da compra
        System.out.println("Total da compra: R$ " + carrinho.getTotal());

    }
}
