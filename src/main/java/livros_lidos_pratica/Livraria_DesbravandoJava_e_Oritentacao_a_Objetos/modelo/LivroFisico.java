package livros_lidos_pratica.Livraria_DesbravandoJava_e_Oritentacao_a_Objetos.modelo;

import livros_lidos_pratica.Livraria_DesbravandoJava_e_Oritentacao_a_Objetos.Livro;
import livros_lidos_pratica.Livraria_DesbravandoJava_e_Oritentacao_a_Objetos.interfaces.Promocional;

public class LivroFisico extends Livro implements Promocional {
    private final double taxa = 0.05;

    public LivroFisico(Autor autor) {
        super(autor);
    }

    

    @Override
    public boolean aplicarDescontoDe(double porcentagem) {
        //Livro fisico permite ate 30% de desconto
        if (porcentagem > 0.3) {
            return false;
        }
        double desconto = getPreco() * porcentagem;
        setPreco(getPreco() - desconto);
        System.out.println("Aplicado desconto ao Livro Fisico");
        return true;
    }



    public double getTaxa() {
        return taxa * this.getPreco();
    }
}
