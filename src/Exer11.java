import java.util.Scanner;

public class Exer11 {
    public static void main(String[]args){

        //Cria um objeto Scanner para ler a entrada
        Scanner e = new Scanner(System.in);

        // Solicita ao usuário que insira o numero
        System.out.print("Insira qualquer número: ");
        float numero = e.nextFloat();

        //Crio uma condicional para saber se o numero é positivo ou negativo
        if (numero <1) {
            System.out.println("Número negativo");
        } else if (numero >1) {
            System.out.println("Número positivo");
        }

    }
}
