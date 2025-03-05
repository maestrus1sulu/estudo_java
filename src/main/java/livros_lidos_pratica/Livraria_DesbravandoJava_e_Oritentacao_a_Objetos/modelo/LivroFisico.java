package livros_lidos_pratica.Livraria_DesbravandoJava_e_Oritentacao_a_Objetos.modelo;

import livros_lidos_pratica.Livraria_DesbravandoJava_e_Oritentacao_a_Objetos.Livro;

public class LivroFisico extends Livro {
    private final double taxa = 0.05;

    public LivroFisico(Autor autor) {
        super(autor);
    }

    public double getTaxa() {
        return taxa * this.getPreco();
    }
}
