package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Idades {

	public static void main(String[] args) {
		//QUESTÃO 3
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double idade1,idade2;
		double media;
		String nome1,nome2,sobrenome1,sobrenome2;
		
		System.out.println("Dados da primeira pessoa:");
		System.out.print("Digite seu primeiro nome: ");
		nome1 = sc.next();
		System.out.print("Digite o seu segundo nome: ");
		sobrenome1 = sc.next();
        System.out.print("Digite sua idade: ");
        idade1 = sc.nextDouble();
        System.out.println("Dados da segunda pessoa: ");
        System.out.print("Digite seu nome: ");
        nome2 = sc.next();
        System.out.print("Digite seu segundo nome: ");
        sobrenome2 = sc.next();
        System.out.print("Digite sua idade: ");
        idade2 = sc.nextDouble();
        media = (idade1 + idade2)/2;
        System.out.println("A media de idades de "+nome1+" "+sobrenome1+" e "+nome2+" "+sobrenome2+" eh de "+media+" anos");
        
        sc.close();
	}

}
