package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um número inteiro N e a altura de N pessoas.
		 * Armazene as N alturas em um vetor. Em seguida, mostrar a altura média dessas
		 * pessoas.
		 */

		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {
			int n, i;
			double soma = 0, media = 0;

			System.out.print("Digite um numero inteiro: ");
			n = sc.nextInt();

			double[] vetor = new double[n];

			for (i = 0; i < vetor.length; i++) {
				System.out.println("Type the height #" + (i + 1) + ": ");
				vetor[i] = sc.nextDouble();
				soma += vetor[i];
			}
			media = soma / n;
			System.out.println("A media das alturas: " + media);

			sc.close();
		}
	}

}
