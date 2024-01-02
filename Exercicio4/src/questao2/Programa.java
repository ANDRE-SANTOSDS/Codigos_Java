package questao2;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Salário bruto: ");
		double grossSalary = sc.nextDouble();
		System.out.print("Imposto: ");
		double tax = sc.nextDouble();
		
		Funcionarios func = new Funcionarios(name, grossSalary,tax);
		
		System.out.print("Funcionário: "+name+", $ ");
		System.out.println(func);
		
		System.out.print("Qual a porcentagem para aumentar o salário? ");
		double percentage = sc.nextDouble();
		func.increaseSalary(percentage);
		
        sc.close();
	}

}
