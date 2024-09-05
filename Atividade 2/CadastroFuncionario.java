import java.util.Scanner;

public class CadastroFuncionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário:");
        String nome = scanner.nextLine();

        System.out.println("Digite o salário do funcionário:");
        double salario = scanner.nextDouble();

        double aumento = calcularAumento(salario);
        double novoSalario = salario + aumento;

        System.out.println("Funcionário: " + nome);
        System.out.println("Salário antigo: R$ " + String.format("%.2f", salario));
        System.out.println("Aumento: R$ " + String.format("%.2f", aumento));
        System.out.println("Salário atual: R$ " + String.format("%.2f", novoSalario));
    }

    public static double calcularAumento(double salario) {
        if (salario >= 1 && salario <= 1000) {
            return salario * 0.15;
        } else if (salario >= 1001 && salario <= 1500) {
            return salario * 0.10;
        } else if (salario >= 1501 && salario <= 2000) {
            return salario * 0.05;
        } else {
            return 0;
        }
    }
}