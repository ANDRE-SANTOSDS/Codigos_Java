package questoes;

import java.util.Locale;
import java.util.Scanner;

public class Aumento {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int porcentagem;
		double salario,aumento;
		System.out.print("Digite o salario da pessoa: ");
		salario = sc.nextDouble();
		
		if(salario <= 1000.00) {
			porcentagem = 20;
			aumento = (salario * porcentagem)/100;
			salario = salario + aumento;
			System.out.printf("Novo salario = R$ %.2f\n", salario);
			System.out.printf("Aumento: R$ %.2f\n", aumento);
			System.out.println("Porcentagem = "+ porcentagem +"%");
		}else if((salario > 1000.00) && (salario <= 3000.00)) {
			porcentagem = 15;
			aumento = (salario * porcentagem)/100;
			salario = salario + aumento;
			System.out.printf("Novo salario = R$ %.2f\n", salario);
			System.out.printf("Aumento: R$ %.2f\n", aumento);
			System.out.println("Porcentagem = "+ porcentagem +"%");
		}else if((salario > 3000.00) && (salario <= 8000.00)) {
			porcentagem = 10;
			aumento = (salario * porcentagem)/100;
			salario = salario + aumento;
			System.out.printf("Novo salario = R$ %.2f\n", salario);
			System.out.printf("Aumento: R$ %.2f\n", aumento);
			System.out.println("Porcentagem = "+ porcentagem +"%");
		}else if(salario > 8000.00) {
			porcentagem = 5;
			aumento = (salario * porcentagem)/100;
			salario = salario + aumento;
			System.out.printf("Novo salario = R$ %.2f\n", salario);
			System.out.printf("Aumento: R$ %.2f\n", aumento);
			System.out.println("Porcentagem = "+ porcentagem +"%");
		}
		
		sc.close();
	}

}
