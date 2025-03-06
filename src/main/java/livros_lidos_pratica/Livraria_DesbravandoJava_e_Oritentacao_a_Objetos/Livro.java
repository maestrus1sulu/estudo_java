package livros_lidos_pratica.Livraria_DesbravandoJava_e_Oritentacao_a_Objetos;

import livros_lidos_pratica.Livraria_DesbravandoJava_e_Oritentacao_a_Objetos.modelo.Autor;

public abstract class Livro {
    private String nome;
    private String descricao;
    private double preco;
    private String isbn;
    private boolean impresso;

    // Atributos Objeto
    private Autor autor;

    public Livro(Autor autor) {
        // - ESTOU DELEGANO PARA OUTRO CONSTRUTOR
        this();// CONSTRUTOR PADRAO
        this.autor = autor;
        this.impresso = true;
    }

    public Livro() {
        this.isbn = "000-00-00000-00-0";
    }

    public void mostrarDetalhes() {
        System.out.println("Mostrando detalhes do Livro \n");
        System.out.printf(
                "Nome: %10s  \n" +
                        "Descrição: %10s \n" +
                        "Preço: %3.2f \n" +
                        "ISBN: %10s \n" +
                        "---------------\n",
                nome, descricao, preco, isbn);

        if (this.temAutor()) {
            autor.mostrarDetalhes();
        }
        System.out.println("----------------------------------------------------------------------------");

    }

    boolean temAutor() {
        return this.autor != null;
    }

    /**
     * Aqui aplicamos uma regra de Orientação a Objetos onde:
     * 
     * TODA classe filha (subclasse) concreta (não abstrata) é obrigada a escrever os metodos abstratos da classe Pai (superclasse),
     * caso contrário seu codigo nao compilará
     * 
     * @param porcentagem
     */
    public abstract boolean aplicarDescontoDe(double porcentagem);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public boolean isImpresso() {
        return impresso;
    }

    public void setImpresso(boolean impresso) {
        this.impresso = impresso;
    }
}
