package q1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = null;
		PrintWriter pw = null;
		var investimento = new ArrayList<Investimentos>();
		Investimentos i = null;
		try {
			sc = new Scanner(new File("entradaInvest.txt"));
			pw = new PrintWriter(new File("saida.txt"));
			String line = "";
			String[] campos = null;
			do {
				line = sc.nextLine();
				campos = line.split(" ");
				String cpf = (campos[0]);
				String investi = (campos[1]);
				Double taxa = Double.parseDouble(campos[2]);
				Integer tempoDias = Integer.parseInt(campos[3]);
				Double capitalInicial = Double.parseDouble(campos[4]);
				i = new Investimentos(cpf, investi, taxa, tempoDias, capitalInicial);
				investimento.add(i);

			} while (sc.hasNext());
			Collections.sort(investimento);

			for (Investimentos investimentos : investimento) {
				System.out.println(investimentos);
				//pw.println(investimentos); O pw não esta imprimindo
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			sc.close();
			pw.close();
		}
	}

}
