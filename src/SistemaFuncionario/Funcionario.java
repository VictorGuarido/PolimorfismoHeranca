package SistemaFuncionario;

public class Funcionario {
    // Atributos protected para que possam ser compartilhados entre o pacote
    protected String nome;
    protected String cpf;
    protected double salario;
    protected int cargo;

    // Constructor
    public Funcionario(String nome, String cpf, double salario, int cargo) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.cargo = cargo;
    }

    // Método compartilhado à outra classe, famoso "Polimorfismo"
    public double bonificacao(double salario){
        salario = salario * 0.1;
        return salario;
    }

}
