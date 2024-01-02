package questoes;

import java.util.Locale;
import java.util.Scanner;

public class Glicose {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double glicose;
		
		System.out.print("Digite a medida da glicose: ");
		glicose = sc.nextDouble();
		
		if(glicose <= 100) {
			System.out.println("Classificacao: Normal");
		}else if((glicose > 100) && (glicose <= 140)) {
			System.out.println("Classificacao: Elevado");
		}else if(glicose > 140) {
			System.out.println("Classificacao: Diabetes");
		}
		
      sc.close();
	}

}
