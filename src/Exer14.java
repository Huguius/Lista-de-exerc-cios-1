import java.util.Scanner;

public class Exer14 {
    public static void main(String[]args){

        //Cria um objeto Scanner para ler a entrada
        Scanner e = new Scanner(System.in);

        //Pede o primeiro número ao usuário
        System.out.print("Insira o primeiro número: ");
        float numero1 = e.nextFloat();

        //Pede o segundo número ao usuário
        System.out.print("Insira um número diferente do primeiro número: ");
        float numero2 = e.nextFloat();

        //Crio uma condicional para saber qual dos números possue um valor maior e assim fazer a divisão do maior para o menor
        if (numero1>numero2){
            float div1 = numero1/numero2;
            System.out.printf("A divisão entre %.2f e %.2f é %.2f ", numero1,numero2,div1);
        } else if (numero2>numero1) {
            float div2 = numero2/numero1;
            System.out.printf("A divisão entre %.2f e %.2f é %.2f ", numero2,numero1,div2);
        }
    }
}
