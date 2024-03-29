package triangulo;

import java.util.Locale;
import java.util.Scanner;

public class Triangulo2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangulo x = new Triangulo();
  
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		double areaX = x.area();
		
		Triangulo y = new Triangulo();
		
		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		double areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f\n",areaX);
		System.out.printf("Triangle Y area: %.4f\n",areaY);
		if(areaX > areaY) {
			System.out.println("Larger area: X");
		}else {
			System.out.println("Large area: Y");
		}
		sc.close();
	}

}
