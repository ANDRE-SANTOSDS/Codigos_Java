package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		holder = sc.nextLine();
		
		System.out.print("Is there na initial deposit (y/n)? ");
		char l = sc.next().charAt(0);
		
		if(l == 'y' || l == 'Y') {
			System.out.print("Enter initial deposit value: ");
			double balance = sc.nextDouble();
			
			Conta ct = new Conta(number, holder, balance);
			
			System.out.println("");
			System.out.println("Account data:");
			System.out.println("Account "+ct.getNumber()+", Holder: "+ct.getHolder()+", Balance: $ "+ct.getBalance());
			
			System.out.println("");
			System.out.print("Enter a deposit value: ");
			double amount = sc.nextDouble();
			ct.deposit(amount);
			System.out.println("Updated account data:");
			System.out.println("Account "+ct.getNumber()+", Holder: "+ct.getHolder()+", Balance: $ "+ct.getBalance());

			System.out.println("");
			System.out.print("Enter a withdraw value: ");
		    amount = sc.nextDouble();
		    ct.withdraw(amount);
		    System.out.println("Updated account data:");
			System.out.println("Account "+ct.getNumber()+", Holder: "+ct.getHolder()+", Balance: $ "+ct.getBalance());
		}else if(l == 'n' || l == 'N') {
			double balance = 0.0;
			Conta ct = new Conta(number, holder,balance);
			System.out.println("");
			System.out.println("Account data:");
			System.out.println("Account "+ct.getNumber()+", Holder: "+ct.getHolder()+", Balance: $ "+ct.getBalance());

			System.out.println("");
			System.out.print("Enter a deposit value: ");
			double amount = sc.nextDouble();
			ct.deposit(amount);
			System.out.println("Updated account data:");
			System.out.println("Account "+ct.getNumber()+", Holder: "+ct.getHolder()+", Balance: $ "+ct.getBalance());

			System.out.println("");
			System.out.print("Enter a withdraw value: ");
		    amount = sc.nextDouble();
		    ct.withdraw(amount);
		    System.out.println("Updated account data:");
			System.out.println("Account "+ct.getNumber()+", Holder: "+ct.getHolder()+", Balance: $ "+ct.getBalance());
		}
		
		sc.close();
	}

}
