package questoes;

import java.util.Locale;
import java.util.Scanner;

public class Experiencias {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {
			
			int i,n1,quantidade1 =0,somaTotal=0;
			double percentual=0,percentual1=0,percentual2=0,sapo = 0,rato = 0,coelho = 0;
			char cobaias;
			
			System.out.print("Quantos casos de teste serao digitados? ");
			n1 = sc.nextInt();
			
			
			for(i = 1;i <= n1;i++) {
				System.out.print("Quantidade de cobaias: ");
				quantidade1 = sc.nextInt();
				System.out.print("Tipo de cobaia: ");
				cobaias = sc.next().charAt(0);
				
				if(cobaias == 'c' || cobaias == 'C') {
					coelho += quantidade1;
				}else if(cobaias == 's' || cobaias == 'S') {
					sapo += quantidade1;
				}else if(cobaias == 'R' || cobaias == 'r') {
					rato += quantidade1;
				}
				somaTotal += quantidade1;
				
			}
			System.out.println();
			System.out.println("RELATORIO FINAL:");
			System.out.println("Total: "+somaTotal+" cobaias");
			System.out.printf("Total de coelhos: %.0f\n",coelho);
			System.out.printf("Total de ratos: %.0f\n",rato);
			System.out.printf("Total de sapos: %.0f\n",sapo);
			
			percentual = (coelho*100)/somaTotal;
			percentual1 = (sapo*100)/somaTotal;
			percentual2 = (rato*100)/somaTotal;
			System.out.printf("Percentual de coelhos: %.2f\n",percentual);
			System.out.printf("Percentual de ratos: %.2f\n",percentual2);
			System.out.printf("Percentual de sapos: %.2f\n",percentual1);

			sc.close();
		}
	}

}
