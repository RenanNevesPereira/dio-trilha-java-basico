import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo = 237.48;

        System.out.println("Por favor digite o número da Agência!");
        agencia = scanner.next();
        System.out.println("Por favor digite o número da Conta!");
        numeroConta = scanner.nextInt();
        System.out.println("Por favor digite o seu Nome!");
        nomeCliente = scanner.next();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$%.2f já está disponível para saque.", nomeCliente, agencia, numeroConta, saldo);
    }

}