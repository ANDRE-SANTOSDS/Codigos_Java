package questao9;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {

			System.out.print("Quantas pessoas voce vai digitar? ");
			int n = sc.nextInt();

			MaisVelho[] vet = new MaisVelho[n];
			
			for (int i = 0; i < vet.length; i++) {
				System.out.printf("Dados da %da pessoa: \n", i + 1);
				System.out.print("Nome: ");
				String nome = sc.next();
				System.out.print("Idade: ");
				Integer idade = sc.nextInt();

				MaisVelho mv = new MaisVelho(nome, idade);
				vet[i] = mv;
			}
			
			var maisv = vet[0];
			for(int i = 0;i < vet.length;i++) {
				if(vet[i].getIdade() > maisv.getIdade()) {
					maisv = vet[i]; 
				}
			}
		System.out.println("PESSOA MAIS VELHA: "+maisv.getNome());

			sc.close();
		}
	}

}
