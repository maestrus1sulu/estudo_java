package livros_lidos_pratica.Livraria_DesbravandoJava_e_Oritentacao_a_Objetos.produtos;

import livros_lidos_pratica.Livraria_DesbravandoJava_e_Oritentacao_a_Objetos.livraria.*;


public class Ebook extends Livro implements Promocional{
    private String waterMark;

    public Ebook(Autor autor) {
        super(autor);
    }

    @Override
    public boolean aplicarDescontoDe(double porcentagem) { // rescrevendo metodo para atender minha necessidade
        if (isImpresso() && porcentagem > 0.15) { // se for difital
            return false;
        }
        double desconto = getPreco() * porcentagem;
        setPreco(getPreco() - desconto);
        System.out.println("Aplicado desconto ao Ebook");
        return true;
    }

    public String getWaterMark() {
        return waterMark;
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }
}
