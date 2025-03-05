package livros_lidos_pratica.Livraria_DesbravandoJava_e_Oritentacao_a_Objetos.modelo;

public class Autor {
    private String nome;
    private String email;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void mostrarDetalhes() {
        System.out.printf(
                "Nome: %10s  \n" +
                        "CPF: %10s \n" +
                        "E-mail: %10s \n",
                getNome(), getCpf(), getEmail());
    }
}
