import java.util.Scanner;

public class Exer15 {
    public static void main(String[] args) {

        // Cria um objeto Scanner para ler a entrada
        Scanner e = new Scanner(System.in);

        // Solicita ao usuário que insira o primeiro número decimal (coeficiente A)
        System.out.print("Insira o valor de A: ");
        float A = e.nextFloat();

        // Solicita ao usuário que insira o segundo número decimal (coeficiente B)
        System.out.print("Insira o valor de B: ");
        float B = e.nextFloat();

        // Solicita ao usuário que insira o terceiro número decimal (coeficiente C)
        System.out.print("Insira o valor de C: ");
        float C = e.nextFloat();

        // Verifica se A é igual a 0 (neste caso, não é possível aplicar Bhaskara)
        if (A == 0) {
            System.out.println("Impossível calcular: A não pode ser igual a 0.");
        } else {
            // Resolvendo a parte do discriminante (b² - 4ac)
            double discriminante = Math.pow(B, 2) - (4 * A * C);

            // Verifica se o discriminante é negativo
            if (discriminante < 0) {
                System.out.println("Impossível calcular: a equação não tem raízes reais.");
            } else {
                // Calcula a raiz quadrada do discriminante
                double raiz = Math.sqrt(discriminante);

                // Calcula as duas possíveis soluções de x (x1 e x2)
                double x1 = (-B + raiz) / (2 * A);
                double x2 = (-B - raiz) / (2 * A);

                // Exibe os resultados
                System.out.printf("Os resultados da equação de Bhaskara são: x1 = %.2f e x2 = %.2f%n", x1, x2);

            }
        }
    }
}