package vetores2;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o tamanho do vetor: ");
		int n = sc.nextInt();
		sc.nextLine();

		double soma = 0.0;
		Student[] students = new Student[n];
		for (int i = 0; i < students.length; i++) {
			System.out.println("Digite o nome do estudante: ");
			String name = sc.nextLine();
			System.out.println("Digite a idade do estudante");
			Integer age = sc.nextInt();
			sc.nextLine();

			Student s = new Student(name, age);
			students[i] = s;
			soma = soma + students[i].getAge();
		}
		double media = soma / n;
		System.out.println("Media: " + media);

		sc.close();
	}

}
