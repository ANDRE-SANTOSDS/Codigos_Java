package questoes;

import java.util.Locale;
import java.util.Scanner;

public class Dardo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double lancamento1,lancamento2,lancamento3;
		 System.out.print("Digite a distancia 1: ");
		 lancamento1 = sc.nextDouble();
		 System.out.print("Digite a distancia 2: ");
		 lancamento2 = sc.nextDouble();
		 System.out.print("Digite a distancia 3: ");
		 lancamento3 = sc.nextDouble();
		
		 if((lancamento1 > lancamento2) && (lancamento1 > lancamento3)) {
			 System.out.printf("Maior distancia: %.2f\n", lancamento1);
		 }else if((lancamento2 > lancamento3) && (lancamento2 > lancamento1)) {
			 System.out.printf("Maior distancia: %.2f\n", lancamento2);
		 }else if((lancamento3 > lancamento1) && (lancamento3 > lancamento2)) {
			 System.out.printf("Maior distancia: %.2f\n", lancamento3);
		 }else {
			 System.out.printf("A tres distancias foram iguais!");
		 }
		 
		 sc.close();
	}

}
