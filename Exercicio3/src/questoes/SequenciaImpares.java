package questoes;

import java.util.Locale;
import java.util.Scanner;

public class SequenciaImpares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {
			int x,i;
			System.out.print("Digite o valor de X: ");
			x = sc.nextInt();
			
			for(i = 1;i <= x;i++) {
				if(i % 2 != 0) {
					System.out.println(""+i);
				}
			}
			
			sc.close();
		}
	}

}
