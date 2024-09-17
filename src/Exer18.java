import java.util.Scanner;

public class Exer18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê os três lados do triângulo
        System.out.println("Digite o valor do lado A:");
        double A = scanner.nextDouble();
        System.out.println("Digite o valor do lado B:");
        double B = scanner.nextDouble();
        System.out.println("Digite o valor do lado C:");
        double C = scanner.nextDouble();

        // Ordena os lados de modo que A seja o maior, sem usar Arrays.sort()
        if (B > A && B > C) {
            double temp = A;
            A = B;
            B = temp;
        } else if (C > A && C > B) {
            double temp = A;
            A = C;
            C = temp;
        }

        // Verifica se os três lados formam um triângulo
        if (A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            // Verifica se é um triângulo retângulo, obtusângulo ou acutângulo
            if (A * A == B * B + C * C) {
                System.out.println("TRIANGULO RETANGULO");
            } else if (A * A > B * B + C * C) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } else {
                System.out.println("TRIANGULO ACUTANGULO");
            }

            // Verifica se é equilátero ou isósceles
            if (A == B && B == C) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (A == B || B == C || A == C) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }
}
