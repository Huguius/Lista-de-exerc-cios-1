import java.util.Scanner;

public class Exer9 {
    public static void main(String[] args) {

        // Criação do objeto Scanner para leitura de entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário o número de cadastro do funcionário
        System.out.print("Digite o número de cadastro do funcionário: ");
        int numeroCadastro = scanner.nextInt();

        // Solicitar ao usuário o número de horas trabalhadas
        System.out.print("Digite o número de horas trabalhadas: ");
        double horasTrabalhadas = scanner.nextDouble();

        // Solicitar ao usuário o valor que recebe por hora
        System.out.print("Digite o valor que o funcionário recebe por hora: ");
        double valorPorHora = scanner.nextDouble();

        // Calcular o salário (salário = horas trabalhadas * valor por hora)
        double salario = horasTrabalhadas * valorPorHora;

        // Exibir o número de cadastro e o salário do funcionário
        System.out.printf("Funcionário número %d tem um salário de R$ %.2f%n", numeroCadastro, salario);
      }

    }
