package funcionarioss;

import java.util.Locale;
import java.util.Scanner;

import funcionarioss.Dados;

@SuppressWarnings("unused")
public class Funcionarios {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		Dados dados = new Dados();		
		System.out.print("Nome: ");
		dados.name = sc.nextLine();
		System.out.print("Salario bruto: ");
		dados.GrossSalary = sc.nextDouble();
		System.out.print("Imposto: ");
		dados.tax = sc.nextDouble();
		
		System.out.printf("Funcionario: %s , $ ",dados.name);
		System.out.print(""+dados.netSalary());
		
		System.out.println();
		System.out.print("Qual a porcentagem para aumentar o salario? ");
		double porcentagem = sc.nextDouble();
		dados.increaseSalary(porcentagem);
		System.out.printf("Dados atualizados: %s, $ ",dados.name);
		System.out.print(""+dados.netSalary());
	    sc.close();
	}
}
