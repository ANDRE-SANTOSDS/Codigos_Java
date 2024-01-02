package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Retangulo {

	public static void main(String[] args) {
		//QUESTÃO 2
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double baseRetangulo,alturaRetangulo,area,perimetro,diagonal;
		
		System.out.print("Digite a base do retangulo: ");
		baseRetangulo = sc.nextDouble();
        System.out.print("Digite a altura do retangulo: ");
        alturaRetangulo = sc.nextDouble();
        area = baseRetangulo * alturaRetangulo;
        System.out.printf("Area: %.4f\n", area);
        perimetro = (baseRetangulo + alturaRetangulo)*2;
        System.out.printf("Perimetro: %.4f\n", perimetro);
        diagonal =  (baseRetangulo*baseRetangulo + alturaRetangulo*alturaRetangulo);
        double d = Math.sqrt(diagonal);
        System.out.printf("Diagonal: %.4f\n",d);
        
        sc.close();
	}

}
