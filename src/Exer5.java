import java.util.Scanner;

public class Exer5 {
    public static void main(String[]args){

        // Cria um objeto Scanner para receber a entrada do usuário
        Scanner e = new Scanner(System.in);

        // Recebe a entrada do user
        System.out.print("Insira o valor de um Lado do quadrado: ");
        float l = e.nextFloat();

        //Fazer o calculo da area de um quadrado
        double quadradol = Math.pow(l,2);

        // Imprimir o valor da area
        System.out.printf("O valor da área desse quadrado é: %.2f m^2" , quadradol);

    }
}
