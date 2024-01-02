package questao6;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {
			int n,i;
			System.out.print("Quantos valores vai ter cada vetor? ");
			n = sc.nextInt();
			
			int vetA[] = new int[n];
			int vetB[] = new int[n];
			System.out.println("Digite os valores do vetor A: ");
			for(i = 0;i < vetA.length;i++) {
				vetA[i] = sc.nextInt();
			}
			
			System.out.println("Digite os valores do vetor B: ");
			for(i = 0;i < vetB.length;i++) {
				vetB[i] = sc.nextInt();
				vetA[i] = vetA[i] + vetB[i];
			}
			System.out.println("VETOR RESULTANTE: ");
			for(i = 0;i < vetA.length;i++) {
				System.out.println(vetA[i]);
			}
			
			sc.close();
		}
	}

}
