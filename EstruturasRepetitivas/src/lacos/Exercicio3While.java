package lacos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3While {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int alcool = 0,gasolina = 0,diesel = 0,fim;
		fim = sc.nextInt();
		
		while(fim != 4) {
			if (fim == 1) {
				alcool = alcool + 1;
			}
			else if (fim == 2) {
				gasolina = gasolina + 1;
			}
			else if (fim == 3) {
				diesel = diesel + 1;
			}
			
			fim = sc.nextInt();
		}
		 
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		

		 
		sc.close();
	}

}
