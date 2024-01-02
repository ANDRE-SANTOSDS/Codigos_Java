package Menu;

import java.util.Locale;
import java.util.Scanner;

public class Progam {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rh rh = new Rh();
		
		System.out.print("Digite o tamanho: ");
		int n = sc.nextInt();
		
		for(int i = 0;i < n;i++) {
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Matricula: ");
			Integer matricula = sc.nextInt();
			System.out.print("Salario: ");
			Double salario = sc.nextDouble();
			System.out.println();
			
			Funcionarios f = new Funcionarios();
			f.setNome(nome);
			f.setMatricula(matricula);
			f.setSalario(salario);
			rh.cadastrar(f);
		}
			rh.listar();
		

		sc.close();
	}

}
