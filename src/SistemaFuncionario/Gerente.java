package SistemaFuncionario;

// Extends indica que a classe GERENTE herda os atributos e métodos (Herança)
public class Gerente extends Funcionario {

    // Modificador(Constructor) do gerente herdando os atributos do Funcionario
    public Gerente(String nome, String cpf, double salario, int cargo, int numeroFuncionariosGerenciados) {
        super(nome, cpf, salario, cargo);
        this.numeroFuncionariosGerenciados = numeroFuncionariosGerenciados;
    }

    int numeroFuncionariosGerenciados;

    @Override // Mesmo método da classe Gerente. Polimorfismo:
    public double bonificacao(double salario){
        salario = salario * 0.5;
        return salario;
    }

    // Polimorfismo:
    public void teste(){
        System.out.println("Olá aluninhos");
    }

    public void teste(String nome){
        System.out.println("Olá aluno: " + nome);
    }

    public void teste(String nome, String sobrenome){
        System.out.println("iai: " + nome + " " + sobrenome);
    }
}
