package aula02ex;

import java.util.Locale;
import java.util.Scanner;

public class Prog {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		CaracteristicaAluno ca = new CaracteristicaAluno();

		ca.nomeEscola = "Heloisa";

		ca.nome = "Pablo Silva";

		ca.turno = "Tarde";

		ca.idade = 10;

		ca.altura = 1.55;

		ca.status();

		System.out.println();

		CaracteristicaAluno ca1 = new CaracteristicaAluno();

		ca1.nomeEscola = "Anisio Teixeira";

		ca1.nome = "Andre santos de souza";

		ca1.turno = "Tarde";

		ca1.idade = 19;

		ca1.altura = 1.65;

		ca1.statuss();

		sc.close();
	}

}
