import java.util.Locale;
import java.util.Scanner;
import entidades.*;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta;

        System.out.print("Informe o número da conta: ");
        int numero = sc.nextInt();
        System.out.print("Informe o titular da Conta: ");
        sc.nextLine();
        String titular = sc.nextLine();
        System.out.print("Dejesa um depósito inicial ? (s/n)");
        char resposta = sc.next().charAt(0);
        if(resposta == 's'){
            System.out.print("Qual o valor do depósito inicial? ");
            double depositoInicial = sc.nextDouble();
            conta = new Conta(numero, titular, depositoInicial);
        }
        else{
            conta = new Conta (numero, titular);
        }
        System.out.println(); //quebra de linha

        System.out.println("Extrato da conta:");
        System.out.println(conta);

        System.out.println(); //quebra de linha
        System.out.print("Informe o valor de depósito: ");
        double valorDeposito = sc.nextDouble();
        conta.deposito(valorDeposito);
        System.out.print("Extrato atualizado: ");
        System.out.print(conta);

        System.out.println(); //quebra de linha
        System.out.print("Informe o valor de saque: ");
        double valorSaque = sc.nextDouble();
        conta.saque(valorSaque);
        System.out.print("Extrato atualizado: ");
        System.out.print(conta);


        sc.close();
    }
}