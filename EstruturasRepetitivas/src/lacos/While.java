package lacos;

import java.util.Locale;
import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);


		int i = 1,soma=0;
		
		while(i != 0) {
			i = sc.nextInt();
			soma = soma+i;
		}
		System.out.println("Soma dos numeros: "+soma);
		sc.close();
	}

}
