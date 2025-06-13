import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int contaNumero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o numero da agência: ");
        agencia = input.nextLine();

        System.out.println("Por favor, digite o número da conta: ");
        contaNumero = input.nextInt();
        input.nextLine();

        System.out.println("Por favor, digite o nome do cliente: ");
        nomeCliente = input.nextLine();

        System.out.println("Por favor, digite o saldo do conta: ");
        saldo = input.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, \n" +
                          "sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível \n" +
                          "para saque!", nomeCliente, agencia, contaNumero, saldo);

    }
}
