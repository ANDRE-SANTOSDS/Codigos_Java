package lacos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2While {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x,y ;
		x = sc.nextInt();
		y = sc.nextInt();
		    
		while(x != 0 && y != 0) {
			
			if((x > 0) && (y > 0)) {
				System.out.println("Primeiro!");
			}else if((x > 0) && (y < 0)) {
				System.out.println("Quarto!");
			}else if((x < 0) && (y < 0)) {
				System.out.println("Terceiro!");
			}else if((x < 0) && (y > 0)) {
				System.out.println("Segundo!");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		sc.close();
	}

}
