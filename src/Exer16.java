import java.util.Scanner;

public class Exer16 {
    public static void main(String[] args) {

        // Cria um objeto Scanner para ler a entrada
        Scanner e = new Scanner(System.in);

        // Pede o horário inicial do jogo
        System.out.print("Insira o horário inicial do jogo em horas: ");
        int horaInicial = e.nextInt();

        // Pede o horário final do jogo
        System.out.print("Insira o horário final do jogo em horas: ");
        int horaFinal = e.nextInt();

        // Cria a variável que irá armazenar a duração do jogo
        int duracao;

        // Condicional para calcular a duração do jogo
        if (horaInicial < horaFinal) {
            // Jogo terminou no mesmo dia
            duracao = horaFinal - horaInicial;
        } else if (horaInicial > horaFinal) {
            // Jogo atravessou a meia-noite
            duracao = (24 - horaInicial) + horaFinal;
        } else {
            // Horário inicial e final são iguais, logo durou 24 horas
            duracao = 24;
        }

        // Exibe a duração do jogo
        System.out.printf("O JOGO DUROU %d HORA(S)%n", duracao);

    }
}

