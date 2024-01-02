package questao4;

import java.util.Locale;
import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {
			int n, i,soma=0;
			System.out.print("Quantos numeros voce vai digitar? ");
			n = sc.nextInt();

			int[] vet = new int[n];
			for (i = 0; i < vet.length; i++) {
				System.out.print("Digite um numero: ");
				vet[i] = sc.nextInt();
			}

			System.out.println("NUMEROS PARES: ");
			for (i = 0; i < vet.length; i++) {
				if (vet[i] % 2 == 0) {
					System.out.printf("%d  ", vet[i]);
					 soma = soma + 1;
				}
			}
			System.out.println("\n");
			System.out.println("QUANTIDADE DE PARES = "+soma);
			
			sc.close();
		}
	}

}
