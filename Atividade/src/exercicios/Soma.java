package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		//QUESTÃO 4
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x,y,soma;
		System.out.print("Digite um numero inteiro: ");
		x = sc.nextInt();
		System.out.print("Digite outro numero inteiro: ");
		y = sc.nextInt();
		soma = (x + y);
        System.out.printf("Soma = %d\n",soma);
        
        sc.close();
	}

}
