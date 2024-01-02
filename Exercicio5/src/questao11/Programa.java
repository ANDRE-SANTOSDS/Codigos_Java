package questao11;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n1 = 0;
		double maior = 0, menor = 0, soma = 0, media = 0, soma1 = 0;

		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		DadosPessoas vet[] = new DadosPessoas[n];

		for (int i = 0; i < vet.length; i++) {
			System.out.printf("Altura da %da pessoa: ", i + 1);
			double altura = sc.nextDouble();
			System.out.printf("Genero da %da pessoa: ", i + 1);
			char genero = sc.next().charAt(0);

			DadosPessoas dadosP = new DadosPessoas(altura, genero);
			vet[i] = dadosP;
		}

		menor = vet[0].getAltura();
		for (int i = 0; i < vet.length; i++) {
			if (menor > vet[i].getAltura()) {
				menor = vet[i].getAltura();
			}
		}

		maior = vet[0].getAltura();
		for (int i = 0; i < vet.length; i++) {
			if (maior < vet[i].getAltura()) {
				maior = vet[i].getAltura();
			}
		}
		System.out.printf("Menor altura = %.2f\n", menor);
		System.out.printf("Maior altura = %.2f\n", maior);

		for (int i = 0; i < vet.length; i++) {
			if (vet[i].getGenero() == 'f' || vet[i].getGenero() == 'F') {
				soma1 = soma1 + vet[i].getAltura();
				n1 = n1 + 1;
				media = soma1 / n1;
			}
		}
		System.out.printf("Media das alturas das mulheres = %.2f\n", media);

		for (int i = 0; i < vet.length; i++) {
			if (vet[i].getGenero() == 'm' || vet[i].getGenero() == 'M') {
				soma = soma + 1;
			}
		}
		System.out.printf("Numero de homens = %.0f\n", soma);

		sc.close();
	}

}
