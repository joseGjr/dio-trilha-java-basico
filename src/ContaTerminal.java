import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        DadosDoCliente dadosDoCliente = new DadosDoCliente();



        System.out.println("Por favor, digite o número da Agência ");
        dadosDoCliente.agencia = sc.next();

        System.out.println("Por favor, digite o número da número ");
        dadosDoCliente.numero = sc.nextInt();

        System.out.println("Por favor, digite nome do cliente:  ");
        dadosDoCliente.nomeCliente = sc.next();

        System.out.println("Por favor, digite o valor a ser depositado:  ");
        dadosDoCliente.saldo = sc.nextDouble();

        System.out.printf("Olá "+ dadosDoCliente.getNomeCliente() +
                " obrigado por criar uma conta em nosso banco, sua agência é " +
                dadosDoCliente.getAgencia() +
                " conta "+ dadosDoCliente.getNumero() + " e seu saldo ,"+ dadosDoCliente.getSaldo() +
                " já está disponível para saque\".");

        sc.close();
    }
}