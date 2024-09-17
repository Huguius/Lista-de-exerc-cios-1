import java.util.Scanner;

public class Exer3 {
    public static void main (String[]args){

        // Cria um objeto Scanner para receber a entrada do usuário
        Scanner e = new Scanner(System.in);

        // Solicita ao usuário que insira o primeiro número
        System.out.print("Digite o primeiro número: ");
        double numero1 = e.nextDouble();

        // Solicita ao usuário que insira o segundo número
        System.out.print("Digite o segundo número: ");
        double numero2 = e.nextDouble();

        // Calcula o valor ao quadrado do numero1
        double quadrado1 = numero1 * numero1;

        // Calcula o valor ao quadrado do numero2
        double quadrado2 = numero2 * numero2;

        // Calcula o produto (soma) entre os numeros ao quadrado
        double produto = quadrado1 + quadrado2;

        // Exibe o resultado do valor ao quadrado
        System.out.printf("O valor ao quadrado de %.2f e %.2f é relativamente: %.2f e %.2f ", numero1, numero2, quadrado1 , quadrado2);

        // Só pula uma linha para ficar estetico
        System.out.println("");

        //Exibe a soma dos valores ao quadrado
        System.out.println("O valor da soma entre os números ao quadrado é: " + produto);
    }
}
