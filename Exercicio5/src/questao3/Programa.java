package questao3;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {
			ArrayList<Alturas> atu = new ArrayList<Alturas>();
			
			int i,n,n1=0;
			double soma=0,media=0;
			System.out.print("Quantas pessoas serao digitadas? ");
			n = sc.nextInt();
			
			for(i = 0;i < n;i++) {
				System.out.printf("Dados da %da pessoa: \n",i+1);
				System.out.print("Nome: ");
				String nome = sc.next();
				System.out.print("Idade: ");
				Integer idade = sc.nextInt();
				System.out.print("Altura: ");
				Double altura = sc.nextDouble();
				
				soma = soma + altura;
				media = soma/n;
				
				Alturas a = new Alturas(nome, idade, altura);
				atu.add(a);
			}
			System.out.printf("Altura média: %.2f\n",media);
			
			for(i = 0;i < n;i++) {
				if(atu.get(i).getIdade() < 16) {
					n1 = n1 + 1;
				}
			}
			double porcentagem = (n1/(double)n)*100;
			System.out.println("Pessoas com menos de 16 anos: "+porcentagem+"%");
			
			for(i = 0;i < n;i++) {
				if(atu.get(i).getIdade() < 16) {
					System.out.println(atu.get(i).getNome());
				}
			}
			sc.close();
		}
	}

}
