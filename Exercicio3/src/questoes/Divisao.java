package questoes;

import java.util.Locale;
import java.util.Scanner;

public class Divisao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {
			int n1, i;
			double numerador, denominador;
			double divisao;

			System.out.print("Quantos casos voce vai digitar? ");
			n1 = sc.nextInt();

			for (i = 1; i <= n1; i++) {
				System.out.print("Entre com o numerador: ");
				numerador = sc.nextDouble();
				System.out.print("Entre com o denominador:");
				denominador = sc.nextDouble();
				divisao = numerador / denominador;
				
				if (denominador == 0) {
					System.out.println("Divisao impossivel");
				}else if(denominador != 0) {
					System.out.printf("Divisao = %.2f\n", divisao);
				}
			}
			sc.close();
		}
	}
}
