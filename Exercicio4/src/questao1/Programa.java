package questao1;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Entre com a largura e altura do retângulo: ");
		double width = sc.nextDouble();
		double height = sc.nextDouble();
		
		Retangulo ret = new Retangulo(width, height);
		
		System.out.printf("Area = %.2f\n",ret.area(height));
		System.out.printf("Perimetro = %.2f\n",ret.perimeter(height));
		System.out.printf("Diagonal = %.2f\n",ret.diagonal(width,height));
		
		sc.close();
	}

}
