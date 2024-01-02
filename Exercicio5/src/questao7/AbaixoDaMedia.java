package questao7;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {
			int n,i;
			double soma=0,media=0;
			System.out.print("Quantos elementos vai ter o vetor? ");
			n = sc.nextInt();
			
			double vet[] = new double[n];
			
			for(i = 0;i < vet.length;i++) {
				System.out.print("Digite um numero: ");
				vet[i] = sc.nextDouble();
				soma += vet[i];
			}
			
			media = soma/n;
			System.out.printf("MEDIA DO VETOR = %.3f\n",media);
			System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
			for(i = 0;i < vet.length;i++) {
				if(vet[i] < media) {
					System.out.println(vet[i]);
				}
			}
			
			
			sc.close();
		}
	}

}
