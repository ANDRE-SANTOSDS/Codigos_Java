package questoes;

import java.util.Locale;
import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n1,n2;
		
		System.out.print("Digite um numero inteiro: ");
		n1 = sc.nextInt();
		System.out.print("Digite outro numero inteiro: ");
		n2 = sc.nextInt();
		
		if((n1 % n2 == 0) || (n2 % n1 == 0)) {
			System.out.printf("Sao multiplos", n1);
		}else if((n1 % n2 != 0) || (n2 % n1 != 0)) {
			System.out.printf("Nao sao multipos",n2);
		}
		
		sc.close();
	}

}
