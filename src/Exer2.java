import java.util.Scanner;

public class Exer2 {
    public static void main (String[]args){

        // Cria um objeto Scanner para receber a entrada do usuário
        Scanner e = new Scanner(System.in);

        // Solicitar ao usuário a base
        System.out.print("Digite o valor da base: ");
        double base = e.nextDouble();

        // Solicitar ao usuário o expoente
        System.out.print("Digite o valor do expoente: ");
        double expoente = e.nextDouble();

        // Calcular a potência utilizando Math.pow()
        double resultado = Math.pow(base, expoente);

        // Exibir o resultado
        System.out.printf("%.2f elevado a %.2f é: %.2f%n", base, expoente, resultado);

    }
}
