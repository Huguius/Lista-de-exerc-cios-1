import java.util.Scanner;

public class Exer13 {
    public static void main(String[]args){

        //Cria um objeto Scanner para ler a entrada
        Scanner e = new Scanner(System.in);

        //Pede o primeiro número ao usuário
        System.out.print("Insira o primeiro número: ");
        float numero1 = e.nextFloat();

        //Pede o segundo número ao usuário
        System.out.print("Insira um número diferente do primeiro número: ");
        float numero2 = e.nextFloat();

        //Pede o terceiro número ao usuário
        System.out.print("Insira um número diferente do segundo e primeiro número: ");
        float numero3 = e.nextFloat();

        //Crio uma condicional para saber qual dos números possue um valor maior
        if (numero1>numero2 && numero1>numero3){
            System.out.printf("O número %.2f é o maior número digitado", numero1);
        } else if (numero2>numero1 && numero2>numero3) {
            System.out.printf("O número %.2f é o maior número digitado", numero2);
        } else if (numero3>numero1 && numero3>numero2) {
            System.out.printf("O número %.2f é o maior número digitado", numero3);
        }
    }
}
