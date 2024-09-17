import java.util.Scanner;

public class Exer17 {
    public static void main(String[]args){

        // Cria um objeto Scanner para ler a entrada
        Scanner e = new Scanner(System.in);

        // Solicita ao usuário que insira o primeiro número inteiro
        System.out.print("Insira o valor de A: ");
        int A = e.nextInt();

        // Solicita ao usuário que insira o segundo número inteiro
        System.out.print("Insira o valor de B: ");
        int B = e.nextInt();

        // Solicita ao usuário que insira o terceiro número inteiro
        System.out.print("Insira o valor de C: ");
        int C = e.nextInt();

        // Solicita ao usuário que insira o quarto número inteiro
        System.out.print("Insira o valor de D: ");
        int D = e.nextInt();

        //Criando variaveis que vou usar na condicional
        int somacd = C + D;
        int somaab = A + B;

        //Crio a condicional proposta
        if (B>C && D>A){
            if (somacd>somaab){
                if (C>=1){
                    if (D>=1){
                        if (A % 2 == 0){
                            //Imprimi valores aceitos na tela
                            System.out.printf("Valores aceitos: A = %d , B =%d , C =%d , D = %d ", A,B,C,D);
                        }
                    }
                }
            }
        } else {
            System.out.println("Valores não aceitos");
        }
    }
}
