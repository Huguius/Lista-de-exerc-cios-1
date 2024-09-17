import java.util.Scanner;

public class Exer12 {
    public static void main (String[]args){

        //Cria um objeto Scanner para ler a entrada
        Scanner e = new Scanner(System.in);

        //Chamo a variavel PI
        double pi = Math.PI;

        // Recebe a entrada do user
        System.out.print("Insira o valor de um lado do quadrado L: ");
        float l = e.nextFloat();

        // Recebe a entrada do user
        System.out.print("Insira o valor de um raio R: ");
        float r = e.nextFloat();

        //Fazer o calculo da area de um quadrado
        double quadradol = Math.pow(l,2);

        //Area do circulo de raio R
        double ac = pi * (Math.pow(r,2));

        //Criar uma condicional para imprimar qual area é maio, a do quadrado ou do circulo
        if (quadradol>ac){
            System.out.printf("A área do quadrado de lado: %f é maior que a área do círculo tendo o raio %f, tendo as áreas respctivamente: %.2f e %.2f " , l,r,quadradol,ac);
        } else if (ac>quadradol) {
            System.out.printf("A área do circulo de raio: %f é maior que a área do quadrado tendo o lado %f, tendo as áreas respctivamente: %.2f e %.2f " , r,l,ac,quadradol);
        }

    }
}
