import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo = 0;

        Scanner entrada = new Scanner(System.in);

//        Exibir as mensagens

        System.out.println("Por favor, digite o número da Agência !");
        agencia = entrada.next();

        System.out.println("Por favor, digite o número da Conta !");
        numeroConta = entrada.nextInt();

        System.out.println("Por favor, insira seu nome");
        nomeCliente = entrada.next();

        System.out.println("Deseja depositar um valor inicial?");
        saldo += entrada.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia+ ", conta "+ numeroConta + " e seu saldo " + saldo+ " já está disponível para saque");
    }
}
