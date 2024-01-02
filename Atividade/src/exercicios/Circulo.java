package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Circulo {

	public static void main(String[] args) {
		//QUESTÃO 6
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double r,area;
		System.out.print("Digite o valor do raio do circulo: ");
		r = sc.nextDouble();
		area = (3.14159 * r * r);
		System.out.printf("Area = %.3f\n",area);

		
		sc.close();
	}

}
