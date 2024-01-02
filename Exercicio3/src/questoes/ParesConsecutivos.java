package questoes;

import java.util.Locale;
import java.util.Scanner;

public class ParesConsecutivos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x,soma,i;
		
		System.out.print("Digite um numero inteiro: ");
        x = sc.nextInt();
        while (x != 0){

            if (x != 0) {
                 soma=0;
                if (x % 2 != 0) {
                    x++;
                }
                for (i = 0; i < 5; i++) {
                    soma += x;
                    x += 2;
                }
                System.out.println("Soma: " + soma);
            }
            System.out.print("Digite um numero inteiro: ");
            x = sc.nextInt();
        } 
		
		sc.close();
	}
	}

