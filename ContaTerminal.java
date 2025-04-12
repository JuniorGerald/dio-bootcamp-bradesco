import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		int numero = 0;
		String conta;
		String nome;
		double saldo;		
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o número da Agencia: ");
		numero = ler.nextInt();
		
		System.out.println("Digite a conta da Agencia: ");
		conta = ler.next();
		
		System.out.println("Digite o nome: ");
		nome = ler.next();
		
		System.out.println("Digite o saldo da conta: ");
		saldo = ler.nextDouble();
		
		System.out.println("Olá "+nome+ ", obrigado por criar uma conta em nosso banco, sua agência é "+conta+", conta " +numero + " e seu saldo "+saldo+" já está disponível para saque.");

	}

}
