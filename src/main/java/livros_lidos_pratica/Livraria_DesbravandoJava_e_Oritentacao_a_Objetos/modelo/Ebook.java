package livros_lidos_pratica.Livraria_DesbravandoJava_e_Oritentacao_a_Objetos.modelo;

import livros_lidos_pratica.Livraria_DesbravandoJava_e_Oritentacao_a_Objetos.Livro;

public class Ebook extends Livro {
    private String waterMark;

    public Ebook(Autor autor) {
        super(autor);
    }

    @Override
    public boolean aplicarDescontoDe(double porcentagem) { // rescrevendo metodo para atender minha necessidade
        if (isImpresso() && porcentagem > 0.15) { // se for difital
            return false;
        }
        return super.aplicarDescontoDe(porcentagem);
    }

    public String getWaterMark() {
        return waterMark;
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }
}
