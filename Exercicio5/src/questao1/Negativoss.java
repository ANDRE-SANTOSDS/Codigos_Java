package questao1;

import java.util.Locale;
import java.util.Scanner;

public class Negativoss {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {
			
			int n,i;
			System.out.print("Quantos numeros voce vai digitar? ");
			n = sc.nextInt();
			
			int vet[] = new int[n];
			if(vet.length < 10) {
				for(i = 0;i < vet.length;i++) {
					System.out.print("Digite um numero: ");
					vet[i] = sc.nextInt();
				}

				System.out.println("NUMEROS NEGATIVOS: ");
				for(i = 0;i < vet.length;i++) {
					if(vet[i] < 0) {
						System.out.println(vet[i]);
					}
				}
			}	
			
			sc.close();
		}
	}

}
