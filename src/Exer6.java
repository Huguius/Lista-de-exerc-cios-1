import java.util.Scanner;

public class Exer6 {
    public static void main(String[]args){

        //Cria um objeto Scanner para receber a entrada do usuário
        Scanner e = new Scanner(System.in);

        //Puxando a variavel PI
        double pi = Math.PI;

        //Solicita ao usuário que insira o primeiro número decimal
        System.out.print("Insira o primeiro número decimal: ");
        float A = e.nextFloat();

        //Solicita ao usuário que insira o segundo número decimal
        System.out.print("Insira o segundo número decimal: ");
        float B = e.nextFloat();

        //Solicita ao usuário que insira o terceiro número decimal
        System.out.print("Insira o terceiro número decimal: ");
        float C = e.nextFloat();

        //Area do triângulo retângulo que tem A por base e C por altura.
        float tr = (A*C)/2;

        //Area do circulo de raio C
        double ac = pi * (Math.pow(C,2));

        //Area do trapezio que tem A e B por bases e C por altura.
        float at = ((A+B)*C)/2;

        //Fazer o calculo da area de um quadrado que tem lado B.
        double quadradol = Math.pow(B,2);

        //Area do retangulo que tem lados A e B.
        float ar = A*B;

        //O perímetro do retângulo que tem lados A e B
        float pr = (A+A)+(B+B);

        //Exibi a área do triângulo retângulo
        System.out.println("A área do triângulo retângulo que tem A por base e C por altura é: " + tr);

        //Exibi a área do círculo de raio C
        System.out.println("A área do círculo de raio C é: " + ac);

        //Exibi a área do trapézio que tem A e B por bases e C por altura.
        System.out.println("A área do trapézio que tem A e B por bases e C por altura é: " + at);

        //Exibi a área do quadrado que tem lado B.
        System.out.println("A área do quadrado que tem lado B é: " + quadradol);

        //Exibi a área do retângulo que tem lados A e B.
        System.out.println("A área do retângulo que tem lados A e B é: " + ar);

        //Exibi o perímetro do retângulo que tem lados A e B.
        System.out.println("O perímetro do retângulo que tem lados A e B é: " + pr);

    }
}
