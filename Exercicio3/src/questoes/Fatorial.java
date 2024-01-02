package questoes;

import java.util.Locale;
import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {
			int fatorial,i;
			System.out.print("Digite o valor de N: ");
			fatorial = sc.nextInt();
			for(i = 1;fatorial > 1;fatorial -= 1) {
				i = i * fatorial;
			}
			System.out.printf("Fatorial  = %d\n",i);
			
			sc.close();
		}
	}

}
