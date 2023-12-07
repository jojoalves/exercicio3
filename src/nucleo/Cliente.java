package nucleo;

public class Cliente {
	private String nome;
    private String sobrenome;
    private String endereco;
    private String cpf;

    public Cliente(String nome, String sobrenome, String endereco, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.endereco = endereco;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
