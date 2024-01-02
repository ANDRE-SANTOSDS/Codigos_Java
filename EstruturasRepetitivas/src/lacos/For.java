package lacos;

import java.util.Locale;
import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {
			int i,n,soma=0;
			
			n = sc.nextInt();
			for(i = 0;i <= n;i++) {
				
				n = sc.nextInt();
				soma = soma + n;
			}
			
			System.out.println("Soma = "+soma);

			sc.close();
		}
	}

}
