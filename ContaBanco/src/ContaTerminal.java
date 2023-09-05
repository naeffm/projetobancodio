import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá, Qual é o sue nome ? "); 
        String nome = scanner.nextLine();

        System.out.println("Por favor, digite o numero da sua AGENICA: ");
        String agencia = scanner.next();

        System.out.println("OK! Agora digite o numero da CONTA: ");
        int conta = scanner.nextInt();
        
        System.out.println("Quanto de saldo gostaria de ter: ");
        float saldo = scanner.nextFloat();

        scanner.close();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque",nome,agencia,conta,saldo);
       


    }
}
