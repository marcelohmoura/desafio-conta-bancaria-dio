import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;
        String mensagem;

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite seu nome e pressione Enter: ");
        nomeCliente = sc.next();
        System.out.println("Digite sua agência e pressione Enter: ");
        agencia = sc.next();
        System.out.println("Por gentileza, digite o número de sua conta e pressione Enter: ");
        numeroConta = sc.nextInt();
        System.out.println("Por fim, digite o valor que deseja disponível para saldo, e pressione Enter: ");
        saldo = sc.nextDouble();

        mensagem = String.format("Olá, %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$%,.2f já está disponível para saque.", nomeCliente, agencia, numeroConta, saldo);

        System.out.println(mensagem);
        
    }
}
