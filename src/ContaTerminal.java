import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.of("pt", "BR"));
        Scanner scanner = new Scanner(System.in).useLocale(Locale.getDefault());

        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor digite o número da Agência:");
        agencia = scanner.next();

        System.out.println("Digite o número da Conta:");
        numeroConta = scanner.nextInt();

        scanner.nextLine(); // consome a quebra de linha

        System.out.println("Digite o seu Nome completo:");
        nomeCliente = scanner.nextLine();

        System.out.println("Digite o valor do Saldo:");
        saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$%.2f já está disponível para saque.",
                nomeCliente, agencia, numeroConta, saldo);
    }
}