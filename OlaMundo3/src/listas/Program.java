package listas;

import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import vetores2.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o tamanho do vetor: ");
		int n = sc.nextInt();
		sc.nextLine();

		double soma = 0.0;
		List<Student> students = new LinkedList<>();
		//var students = new LinkedList<Student>();
		
		for (int i = 0; i < students.size(); i++) {
			System.out.println("Digite o nome do estudante: ");
			String name = sc.nextLine();
			System.out.println("Digite a idade do estudante");
			Integer age = sc.nextInt();
			sc.nextLine();

			students.add(new Student(name,age));
			soma = soma + students.get(i).getAge();
		}
		double media = soma / n;
		System.out.println("Media: " + media);

		sc.close();

	}

}
