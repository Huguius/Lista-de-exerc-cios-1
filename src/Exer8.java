import java.util.Scanner;

public class Exer8 {
    public static void main (String[]args) {

        // Criação do objeto Scanner para leitura de entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário os quatro números
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double numero3 = scanner.nextDouble();

        System.out.print("Digite o quarto número: ");
        double numero4 = scanner.nextDouble();

        // Calcular a média aritmética
        double media = (numero1 + numero2 + numero3 + numero4) / 4;

        // Exibir o resultado
        System.out.printf("A média aritmética dos números é: %.2f%n", media);
    }
}
