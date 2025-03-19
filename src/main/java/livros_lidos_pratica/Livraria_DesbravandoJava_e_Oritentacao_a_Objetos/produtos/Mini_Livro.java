package livros_lidos_pratica.Livraria_DesbravandoJava_e_Oritentacao_a_Objetos.produtos;

import livros_lidos_pratica.Livraria_DesbravandoJava_e_Oritentacao_a_Objetos.livraria.*;

public class Mini_Livro extends Livro{
    
    public Mini_Livro(Autor autor){
        super(autor); // Delegando para o construtor da classe pai usando o super()
    }

}
