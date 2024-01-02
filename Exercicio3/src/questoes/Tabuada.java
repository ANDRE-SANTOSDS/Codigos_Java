package questoes;

import java.util.Locale;
import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {
			int n,i;
			System.out.print("Deseja a tabuada para qual valor? ");
			n = sc.nextInt();
			for(i = 1;i <= 10;i++) {
				System.out.printf("%d * %d = ",n,i);
				System.out.printf("%d\n",n*i);
			}
			
			sc.close();
		}
	}

}
