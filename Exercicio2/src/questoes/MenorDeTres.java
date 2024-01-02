package questoes;

import java.util.Locale;
import java.util.Scanner;

public class MenorDeTres {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int valor1,valor2,valor3;
		
		System.out.print("Primeiro valor: ");
		valor1 = sc.nextInt();
		System.out.print("Segundo valor: ");
		valor2 = sc.nextInt();
		System.out.print("Terceiro valor: ");
		valor3 = sc.nextInt();
		
		if((valor1 < valor2) && (valor1 < valor3)) {
			System.out.printf("Menor: %d\n",valor1);
		}else if((valor2 <= valor1) && (valor2 <= valor3)) {
			System.out.printf("Menor: %d\n",valor2);
		}else if((valor3 <= valor1) && (valor3 <= valor2)) {
			System.out.printf("Menor: %d\n",valor3);
		}else if((valor1 == valor2) && (valor2 == valor3) && (valor1 == valor3)) {
			System.out.printf("Menor: %d\n",valor1);
		}
		
		sc.close();

	}

}
