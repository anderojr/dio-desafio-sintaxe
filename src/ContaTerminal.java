import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, informe sua agência: ");
        String agencia = scanner.next();

        System.out.print("Por favor, informe o número da sua conta: ");
        int numero = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Legal! Agora por favor, informe seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por ser nosso primeiro cliente, que tal escolher seu saldo?");
        System.out.print("Informe seu saldo pretendido: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco!");
        System.out.println("O número da sua agência é " + agencia + ", o número da sua conta é " + numero + " e seu saldo no valor de R$ " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
