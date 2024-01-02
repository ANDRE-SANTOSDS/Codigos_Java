package questoes;

import java.util.Locale;
import java.util.Scanner;

public class Combustivel {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int alcool = 0, gasolina = 0, diesel = 0, n1;
		
		System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
		n1 = sc.nextInt();

		while (n1 != 4) {
			if (n1 == 1) {
				alcool = alcool + 1;
			} else if (n1 == 2) {
				gasolina = gasolina + 1;
			} else if (n1 == 3) {
				diesel = diesel + 1;
			}
			System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
			n1 = sc.nextInt();
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

		sc.close();
	}

}
