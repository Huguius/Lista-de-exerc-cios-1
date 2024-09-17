import java.util.Scanner;

public class Exer4 {
    public  static void main (String[]args){

        // Cria um objeto Scanner para receber a entrada do usuário
        Scanner e = new Scanner(System.in);

        // Solicita ao usuário que insira o primeiro número inteiro
        System.out.print("Insira o primeiro número inteiro: ");
        int numero1 = e.nextInt();

        // Solicita ao usuário que insira o segundo número inteiro
        System.out.print("Insira o segundo número inteiro: ");
        int numero2 = e.nextInt();

        //Adiciona + 1 nos valores intados
        int m1 = numero1 + 1;
        int m2 = numero2 + 1;

        //Exibi os números consecutivos desses números
        System.out.printf("O número %d e %d, possuem como números consecutivos como: %d e %d ",numero1, numero2, m1, m2);
    }
}
