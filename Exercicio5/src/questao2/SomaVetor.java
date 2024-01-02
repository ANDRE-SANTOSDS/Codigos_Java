package questao2;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {
			int i,n;
			double soma = 0,media = 0;
			System.out.print("Quantos numeros voce vai digitar? ");
			n = sc.nextInt();
			
			Double vet[] = new Double[n];
			
			for(i = 0;i < vet.length;i++) {
				System.out.print("Digite um numero: ");
				vet[i] = sc.nextDouble();
		        soma = soma + vet[i];
		        media = soma/n;
			}

			System.out.print("VALORES = ");
			for(i = 0;i < vet.length;i++) {
				System.out.printf("  %.1f",vet[i]);
			}
			System.out.printf("\nSOMA = %.2f\n",soma);
			System.out.printf("MEDIA = %.2f\n",media);
			
			
			sc.close();
		}
	}

}
