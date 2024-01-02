package questao10;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();

		Aprovados[] vet = new Aprovados[n];

		for (int i = 0; i < vet.length; i++) {
			sc.nextLine();
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno: \n", i + 1);
			String nome = sc.nextLine();
			Double nota1 = sc.nextDouble();
			Double nota2 = sc.nextDouble();

			Aprovados apr = new Aprovados(nome, nota1, nota2);	
			vet[i] = apr;
		}

		System.out.println("Alunos aprovados:");
		for(int i = 0;i < vet.length;i++) {
			if(vet[i].media() >= 6.0) {
				System.out.println(vet[i].getNome());
			}
		}
		
		sc.close();
	}

}
