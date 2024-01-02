package questao8;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {
			int n, i;
			double media = 0, soma = 0;

			System.out.print("Quantos elementos vai ter o vetor? ");
			n = sc.nextInt();

			int[] vet = new int[n];

			for (i = 0; i < vet.length; i++) {
				System.out.print("Digite um numero: ");
				vet[i] = sc.nextInt();
				soma = soma + vet[i];
			}

			for (i = 0; i < vet.length; i++) {
			if (vet[i] % 2 == 0) {
				media = soma / n;
				System.out.printf("MEDIA DOS PARES = %.1f\n", media);
				break;
			} else if (vet[i] % 2 != 0){
				System.out.println("NENHUM NUMERO PAR");
				break;
			}
			}

			sc.close();
		}
	}

}
