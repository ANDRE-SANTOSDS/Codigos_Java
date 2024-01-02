package ok;

import java.util.Locale;
import java.util.Scanner;

import ruim.Account;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter account data");

		System.out.println("Number: ");
		Integer number = sc.nextInt();

		System.out.println("Holder: ");
		String holder = sc.nextLine();
		sc.nextLine();
		System.out.println("Initial balance: ");
		double balance = sc.nextDouble();

		System.out.println("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();

		Account conta = new Account(number, holder, balance, withdrawLimit);

		System.out.println("Enter amount for withdraw: ");
		double amount = sc.nextDouble();
		
		try {
			conta.withdraw(amount);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

		sc.close();
	}

}
