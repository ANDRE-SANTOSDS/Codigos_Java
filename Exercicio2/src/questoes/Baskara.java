package questoes;

import java.util.Locale;
import java.util.Scanner;

public class Baskara {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double a,b,c,delta,x1,x2;
        System.out.print("Digite o coeficiente a: ");
        a = sc.nextDouble();
        System.out.print("Digite o coeficiente b: ");
        b = sc.nextDouble();
        System.out.print("Digite o coeficiente c: ");
        c = sc.nextDouble();
        delta = (b*b) - 4*a*c;
        
        x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
        x2 = (- b - Math.sqrt(delta)) / (2.0 * a);
        
        System.out.printf("X1: %.4f\n", x1);
        System.out.printf("X2: %.4f\n", x2);
        
        if(delta < 0) {
        	System.out.print("Esta equacao nao possui raizes reais");
        }
        
        sc.close();
	}

}
