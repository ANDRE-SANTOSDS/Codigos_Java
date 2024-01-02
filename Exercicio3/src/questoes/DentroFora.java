package questoes;

import java.util.Locale;
import java.util.Scanner;

public class DentroFora {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {
			int n, i, n1,dentro = 0,fora = 0;
			System.out.print("Quantos numeros voce vai digitar? ");
			n = sc.nextInt();

			for (i = 1; i <= n; i++) {
				System.out.print("Digite um numero: ");
				n1 = sc.nextInt();
				
				if(n1 >= 10 && n1 <= 20) {
					dentro = dentro + 1;
				}else {
					fora = fora + 1;
				}
				
			}
			System.out.println(dentro+" Dentro");
			System.out.println(fora+" Fora");
			
			sc.close();
		}
	}

}
