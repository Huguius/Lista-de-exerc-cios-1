import java.util.Scanner;

public class Exer7 {
    public static void main (String[]args){

        //Cria um objeto Scanner para receber a entrada do usuário
        Scanner e = new Scanner(System.in);

        //Solicita ao usuário que insira um lado do triângulo retângulo
        System.out.print("Insira o valor do lado A do triângulo retângulo: ");
        float A = e.nextFloat();

        //Solicita ao usuário que insira um lado do triângulo retângulo
        System.out.print("Insira o valor do lado B do triângulo retângulo: ");
        float B = e.nextFloat();

        //Calcula a hipotenusa do triângulo
        double x = Math.pow(A,2);
        double y = Math.pow(B,2);
        double f = x+y;
        double hipotenusa = Math.sqrt(f);

        //Exibi hipotenusa do triângulo.
        System.out.printf("O valor do lado A é: %.2f e o valor do lado B é: %.2f com isso a  hipotenusa do triângulo retângulo é: %.2f" , A , B , hipotenusa);
    }
}
