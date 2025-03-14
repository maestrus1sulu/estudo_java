
public interface Produto {

    /**
     * O que uma interface pode ter ?
     * 
     * Métodos abstratos (implicitamente public e abstract) -
     * São métodos sem corpo (implementação).
     * Implicitamente são public e abstract, então não é necessário especificar
     * esses modificadores.
     * 
     * Métodos padrão (default methods) — introduzidos no Java 8 -
     * Métodos concretos (com corpo) que têm a palavra-chave default.
     * Podem ser sobrescritos pelas classes que implementam a interface.
     * Permitem adicionar novos métodos em interfaces sem quebrar as implementações
     * existentes.
     * 
     * Métodos estáticos — introduzidos no Java 8 -
     * São métodos concretos que pertencem à interface (não às classes que a
     * implementam).
     * São chamados diretamente pela interface.
     * 
     * Métodos privados — introduzidos no Java 9.
     * Servem para encapsular lógica interna na interface.
     * Só podem ser chamados por outros métodos default ou static da mesma
     * interface.
     * 
     * Constantes (atributos public static final) -
     * Atributos em interfaces são implicitamente public static final.
     * Por convenção, seus nomes são escritos em letras maiúsculas com _ separando
     * palavras.
     */

    /**
     * METODO ABSTRATO - SEM CORPO
     * 
     * Como todo metodo sem corpo de uma interface é abstrato, o uso do modificador
     * abstract é OPCIONAL
     * Não precisamos tambem adicionar o modificador public, pois seus metodos
     * tambem sao publicos por padrao.
     * vamos simplificar: public abstract double getPreco();
     */
    double getPreco();

    /**
     * Método default (padrão) genérico para
     * 
     * @return exibi informações básicas
    */ 
    // default String exibirInformacoes() {
    //     return String.format("Produto: %s | Preço: R$ %.2f",
    //             this.getClass().getSimpleName(),
    //             getPreco());
    // }
}
