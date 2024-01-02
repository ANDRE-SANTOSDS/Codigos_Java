package lacos;

import java.util.Locale;
import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double c,f;
		char resp;
		
		do {
			System.out.print("Digite a temperatura em celsius: ");
			c = sc.nextDouble();
			f = 9.0 * c / 5.0 + 32;
			System.out.printf("Equivalente em fahrenheit: %.1f\n", f);
			System.out.print("Deseja repetir (s/n)? ");
		    resp = sc.next().charAt(0);
			
		}while(resp != 'n');
		
		sc.close();
	}

}
