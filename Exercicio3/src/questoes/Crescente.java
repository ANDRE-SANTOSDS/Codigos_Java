package questoes;

import java.util.Locale;
import java.util.Scanner;

public class Crescente {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double x,y;
	
		System.out.println("Digite dois numeros: ");
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		while(x != y) { 
			if(x > y) {
		        System.out.println("Decrescente!");
		        System.out.println("Digite outros dois numeros: ");
			}else if(y > x) {
		        System.out.println("Crescente!");
		        System.out.println("Digite outros dois numeros: ");
			}
			x = sc.nextDouble();
			y = sc.nextDouble();
		}
		
		sc.close();
	}

}
