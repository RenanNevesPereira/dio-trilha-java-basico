import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo = 237.48;

        // Solicitação de dados ao usuário
        System.out.println("Por favor digite o número da Agência!");
        agencia = scanner.next();
        System.out.println("Digite o número da Conta!");
        numeroConta = scanner.nextInt();
        System.out.println("Digite o seu Nome!");
        nomeCliente = scanner.next();

        // Exibição da mensagem de boas-vindas com os dados bancários
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$%.2f já está disponível para saque.", nomeCliente, agencia, numeroConta, saldo);
    }

}