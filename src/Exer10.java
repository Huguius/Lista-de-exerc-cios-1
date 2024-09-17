import java.util.Scanner;

public class Exer10 {
    public static void main(String[] args) {

        // Criação do objeto Scanner para leitura de entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário o nome do vendedor
        System.out.print("Digite o nome do vendedor: ");
        String nomeVendedor = scanner.nextLine();

        // Solicitar ao usuário o salário fixo do vendedor
        System.out.print("Digite o salário fixo do vendedor: ");
        double salarioFixo = scanner.nextDouble();

        // Solicitar ao usuário o total de vendas efetuadas no mês
        System.out.print("Digite o total de vendas efetuadas no mês (em dinheiro): ");
        double totalVendas = scanner.nextDouble();

        // Calcular a comissão (15% sobre o total de vendas)
        double comissao = totalVendas * 0.15;

        // Calcular o total a receber (salário fixo + comissão)
        double totalAReceber = salarioFixo + comissao;

        // Exibir o total a receber
        System.out.printf("O total a receber pelo vendedor %s no final do mês é: R$ %.2f%n", nomeVendedor, totalAReceber);

    }
}
