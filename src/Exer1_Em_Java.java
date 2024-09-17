import java.util.Scanner;

public class Exer1_Em_Java {
    public static void main(String[] args) {

        // Cria um objeto Scanner para receber a entrada do usuário
        Scanner e = new Scanner(System.in);

        // Solicita ao usuário que insira o primeiro número
        System.out.print("Digite o primeiro número: ");
        float n1 = e.nextFloat();

        // Solicita ao usuário que insira o segundo número
        System.out.print("Digite o segundo número: ");
        float n2 = e.nextFloat();

        // Calcula o produto (multiplicação) dos dois números
        float produto = n1 * n2;

        // Exibe o resultado da multiplicação
        System.out.printf("O produto de %.2f e %.2f é: %.2f%n", n1, n2, produto);

    }
}