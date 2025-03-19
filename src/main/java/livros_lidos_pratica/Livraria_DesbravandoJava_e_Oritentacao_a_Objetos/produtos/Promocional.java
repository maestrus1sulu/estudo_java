package livros_lidos_pratica.Livraria_DesbravandoJava_e_Oritentacao_a_Objetos.produtos;

public interface Promocional {
    boolean aplicarDescontoDe(double porcentagem);

    /**
     * Usamos a palavra reservada DEFAULT no inicio da declaração de um metodo
     * de interface para que ele possa ter o codigo implementado.
     * 
     * dessa forma, toda classe que implementar a interface Promocional terá um novo
     * método aplicarDescontoDe10Porcento(), SEM A OBRIGAÇÃO DE IMPLEMENTAR NENHUMA
     * LINHA DE CODIGO
     * 
     * Perceba que se declarar como Livro no DJOO vai ocasionar erro.
     * Livro é abstrata, então não pode ter implementação de metodos da interface.
     * O tipo de variável é Livro, então só os metodos definidos em Livro ESTÃO
     * ACESSIVEIS DIRETAMENTE.
     * 
     * ERRO só ocorre quando o objeto é declarado como Livro, pois Livro não
     * implementa diretamente Promocional.
     * 
     */
    default boolean aplicarDescontoDe10Porcento() {
        return aplicarDescontoDe(0.1);
    }

}
