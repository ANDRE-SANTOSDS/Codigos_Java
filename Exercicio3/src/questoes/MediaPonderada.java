package questoes;

import java.util.Locale;
import java.util.Scanner;

public class MediaPonderada {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {
			int i;
			double n,n1,n2,n3,mediaPonderada = 0;
			System.out.print("Quantos casos voce vai digitar? ");
			n = sc.nextDouble();
			
			for(i = 1;i <= n;i++) {
				System.out.println("Digite tres numeros: ");
				n1 = sc.nextDouble();
				n2 = sc.nextDouble();
				n3 = sc.nextDouble();
				mediaPonderada = (n1*2 + n2*3 + n3*5)/10;
				System.out.printf("MEDIA = %.1f\n",mediaPonderada);
			}
      
			sc.close();
		}
	}

}
