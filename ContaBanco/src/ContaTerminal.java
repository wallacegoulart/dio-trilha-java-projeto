import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main (String[] args){

        Locale.setDefault(new Locale("en", "US"));
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        int numeroConta = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o número da agencia: ");
        String agencia = sc.nextLine();
        System.out.print("Digite o seu nome: ");
        String nomeCliente = sc.nextLine();
        System.out.print("Digite o seu saldo: ");
        float saldo = sc.nextFloat();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$%.2f já está disponível para saque",nomeCliente,agencia,numeroConta,saldo);

        sc.close();

    }
    
}
