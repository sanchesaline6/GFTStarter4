package Exercicio3;

public class Contato {
    private int codigo;
    private String telefone;
    private int idade;

    public Contato(int codigo, String telefone, int idade) {
        this.codigo = codigo;
        this.telefone = telefone;
        this.idade = idade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "codigo=" + codigo +
                ", telefone='" + telefone + '\'' +
                ", idade=" + idade +
                '}';
    }
}
