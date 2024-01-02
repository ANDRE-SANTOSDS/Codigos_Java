package questoes;

import java.util.Locale;
import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char cf;
		double f, c, celsius, fahrenheit;
		System.out.print("Voce vai digitar a temperatura em qual escala (C/F): ");
		cf = sc.next().charAt(0);

		switch (cf) {
			case 'C':
			case 'c':
				System.out.print("Digite a temperatura em Celsius:");
				c = sc.nextDouble();
				fahrenheit = (c * 9 / 5) + 32;
				System.out.printf("Temperatura equivalente em Fahrenheit: %.2f\n", fahrenheit);
				break;
			case 'f':
			case 'F':
				System.out.print("Digite a temperatura em Fahrenheit: ");
				f = sc.nextDouble();
				celsius = (f - 32) / 9 * 5;
				System.out.printf("Temperatura equivalente em Celsius: %.2f\n", celsius);
				break;
			default:
				System.out.println("Opcao invalida!");
				break;
		}
		sc.close();
	}

}
