package aula05ex;

import java.util.Locale;
import java.util.Scanner;

public class Aula05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite seu nome: ");
		String nome = sc.nextLine();
		System.out.print("Digite seu cpf: ");
		String cpf = sc.nextLine();
		System.out.print("Digite sua senha:");
		int senha = sc.nextInt();
		System.out.print("Digite o saldo da sua conta: ");
		double saldo = sc.nextDouble();
		
		Conta2 c1 = new Conta2(nome,cpf,senha,saldo);
		
		System.out.print("Quanto você deseja sacar: ");
		double sq = sc.nextDouble();	
		c1.valorDps(sq);
		c1.saldAtual(sq);
		c1.valorSacado(sq);
		c1.status();

		sc.close();
	}

}
