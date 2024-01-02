package muitoruim;

import java.util.Locale;
import java.util.Scanner;

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
		Double balance = sc.nextDouble();
		
		System.out.println("Withdraw limit: ");
		Double withdrawLimit = sc.nextDouble();
		
		System.out.println("Enter amount for withdraw: ");
		Double amount = sc.nextDouble();
		
		Account acc = new Account(number, holder, balance, withdrawLimit);
		
	    if(amount >  withdrawLimit) {
	    	System.out.println("Withdraw error: The amount exceeds withdraw limit");
	    }else if(amount > balance) {
	    	System.out.println("Withdraw error: Not enough balance");
	    }else {
	    	acc.withdraw(amount);
	    }
		
		sc.close();
	}

}
