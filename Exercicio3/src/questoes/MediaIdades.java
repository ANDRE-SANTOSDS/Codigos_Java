package questoes;

import java.util.Locale;
import java.util.Scanner;

public class MediaIdades {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int idade1,idade2,idade3,idade4 = 0;
		double soma = 0,media=0,soma1=0,media1=0;
        System.out.println("Digite as idades:");
        idade1 = sc.nextInt();
        
		
		while(idade1 < 0) {
			System.out.println("Impossivel calcular");
			 break;
		}
	
		while(idade1 > 0) {
			idade2 = sc.nextInt();
			idade3 = sc.nextInt();
			idade4 = sc.nextInt();
			soma = idade1 + idade2 + idade3 + idade4;
			media = soma/4;
			soma1 = idade1+idade2+idade3;
			media1 = soma1/3;
			if((idade1 > 0)&&(idade2 > 0)&&(idade3 > 0)&&(idade4 > 0)) {
				System.out.println("Media = "+media);
				break;
			}else if((idade1 > 0)&&(idade2 > 0)&&(idade3 > 0)&&(idade4 < 0)) {
				System.out.printf("Media = %.2f\n",media1);
				break;
			}
	  }
		
		
		sc.close();
	}

}
