package questao5;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {
			int n,i;
			double maior = 0,soma=0;
			
			System.out.print("Quantos numeros voce vai digitar? ");
			n = sc.nextInt();
			
			double vet[] = new double[n];
			
			maior = vet[0];
			
			for(i = 0; i < vet.length;i++) {
				System.out.print("Digite um numero: ");
				vet[i] = sc.nextDouble();
			}
			for(i = 0; i < vet.length;i++) {
				if(maior < vet[i]) {
					maior = vet[i];
					soma = soma + 1;
				}
			}
			System.out.printf("MAIOR VALOR = %.1f\n",maior);
			System.out.printf("POSICAO DO MAIOR VALOR = %.0f\n",soma);
			
			sc.close();
		}
	}

}
