package lacos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1While {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

	     	int i = 0;
		    
		while(i != 2002) {
			i = sc.nextInt();
			if(i != 2002) {
				System.out.println("Senha invalida!");
			}else {
				System.out.println("Acesso permitido!");
			}
		}
		
		sc.close();
	}

}
