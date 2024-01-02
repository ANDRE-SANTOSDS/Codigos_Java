package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Medidas {

	public static void main(String[] args) {
		//QUESTÃO 9
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double a,b,c,quadrado,triangulo,trapezio;
		System.out.print("Digite a medida A: ");
		a = sc.nextDouble();
		System.out.print("Digite a medida B: ");
		b = sc.nextDouble();
		System.out.print("Digite a medida C: ");
        c = sc.nextDouble();
        quadrado = a*a;
        System.out.printf("Area do quadrado: %.4f\n",quadrado);
        triangulo = (a*b)/2;
        System.out.printf("Area do triangulo: %.4f\n",triangulo);
		trapezio = (a+b)/2*c;
		System.out.printf("Area do trapezio: %.4f\n", trapezio);
		sc.close();
	}
}
