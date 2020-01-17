package SistemaFuncionario;

public class App {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(
                "Bruno",
                "734674678643-2",
                20000.00,
                0
        );

        Gerente gerente = new Gerente(
                "Jefferson",
                "394834839-2",
                20000.00,
                1,
                10 // Atributo que só gerente tem
        );

        System.out.println(gerente.bonificacao(gerente.salario));
        System.out.println(funcionario.bonificacao(funcionario.salario));

        gerente.teste();
        gerente.teste("Jerfferson");
        gerente.teste("Jerfersson", "Jorge");
    }
}
