package livros_lidos_pratica.Livraria_DesbravandoJava_e_Oritentacao_a_Objetos;

import livros_lidos_pratica.Livraria_DesbravandoJava_e_Oritentacao_a_Objetos.modelo.Autor;
import livros_lidos_pratica.Livraria_DesbravandoJava_e_Oritentacao_a_Objetos.modelo.Ebook;

public class DJOO {
    // --------------------------------------REGISTRO DE VENDAS-------------------------------------

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

        // SEMPRE USAR DEPOIS DA INSTACIA AUTOR TER SIGO POPULADA "INSERIDA OS VALORE DE
        // AUTOR" - EVITOR PASSAR AUTOR NULO (NULL)
        Livro livro1 = new Livro(autor1);

        livro1.setNome("Cronicas de Narnia");
        livro1.setDescricao("Livro para adolescentes");
        livro1.setPreco(59.90);
        livro1.setIsbn("100-222-00");
        livro1.setAutor(autor1);

        livro1.mostrarDetalhes();

        if (!livro1.aplicarDescontoDe(0.3)) {
            System.out.println("Desconto no livro não pode ser maior do que 30%");
        } else {
            System.out.println("Valor do livro com desconto: " + livro1.getPreco());
        }

        Ebook ebook = new Ebook(autor1);
        ebook.setPreco(29.90);
        ebook.setImpresso(false);

        if (!ebook.aplicarDescontoDe(0.15)) {
            System.out.println("Desconto no livro não pode ser maior do que 15%");
        } else {
            System.out.println("Valor do ebook com desconto: " + ebook.getPreco());
        }

    }
}
