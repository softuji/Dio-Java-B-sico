import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();


        System.out.println("Por favor, digite o seu primeiro e ultimo nome: ");
        String nomeCliente = scanner.nextLine().toUpperCase();

        System.out.println("Por favor, digite a quantia que deseja emprestar: ");
        double saldo = scanner.nextDouble();
        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + 
        agencia + ", conta " + numero + " e seu saldo de R$ " + saldo + " já está disponivel para saque.");
    }
}
