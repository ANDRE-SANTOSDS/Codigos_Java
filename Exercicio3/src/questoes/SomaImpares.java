package questoes;

import java.util.Locale;
import java.util.Scanner;

public class SomaImpares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {
			int x, y, soma1 = 0;
			System.out.println("Digite dois numeros: ");
			x = sc.nextInt();
			y = sc.nextInt();

			if (x < y && y > 0) {
				for (;x < y; x++) {
					if (x % 2 != 0) {
						soma1 += x;
					}
				}
				System.out.println("Soma dos impares: " + soma1);
			} else if (x > y && y > 0) {
				for(;y < x;y++) {
					if (y % 2 != 0) {
						soma1 += y;
					}
				}
				System.out.printf("Soma dos impares: %d\n", soma1);
			}else if(x > y && y < 0) {
				for(;y+1 < x;y++) {
					if (y % 2 != 0) {
						soma1 += y;
					}
				}
				System.out.printf("Soma dos impares: %d\n", soma1*(-1));
			}

			sc.close();
		}
	}

}
