package questoes;

import java.util.Locale;
import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1,nota2,soma = 0;
		
		System.out.print("Digite sua primeira nota: ");
		nota1 = sc.nextDouble();
		System.out.print("Digite sua segunda nota: ");
		nota2 = sc.nextDouble();
		soma = nota1 + nota2;
		
		if(soma > 60.00) {
			System.out.printf("Nota final: %.1f\n", soma);
		}else if(soma < 60.00) {
			System.out.printf("Nota final: %.1f\n", soma);
			System.out.printf("REPROVADO!");
		}
		
       sc.close();

	}

}
