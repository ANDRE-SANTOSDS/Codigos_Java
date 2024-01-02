package questoes;

import java.util.Locale;
import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {
			int n,n1,i;
			System.out.print("Quantos numeros voce vai digitar? ");
			n = sc.nextInt();
			
			for(i = 1;i <= n;i++) {
				System.out.print("Digite um numero: ");
				n1 = sc.nextInt();
				
				if((n1 < 0) && (n1 % 2 != 0)) {
						System.out.println("IMPAR NEGATIVO");
				}else if(n1 == 0) {
					System.out.println("NULO");
				}else if((n1 > 0) && (n1 % 2 != 0)) {
						System.out.println("IMPAR POSITIVO");
				}else if((n1 < 0) && (n1 % 2 == 0)) {
						System.out.println("PAR NEGATIVO");
				}else if((n1 > 0) && (n1 % 2 == 0)) {
					System.out.println("PAR POSITIVO");
				}
			}
			
			sc.close();
		}
	}

}
