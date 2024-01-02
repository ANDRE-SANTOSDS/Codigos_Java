package aula05;

import java.util.Locale;
import java.util.Scanner;

public class Aula05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Conta c1 = new Conta();
		c1.setNumConta(111111);
		c1.setDono("Jubileu");
		c1.abrirConta("CC");
		c1.depositar(100);
		c1.sacar(150);
		c1.fecharConta();
		c1.estadoAtual();
		
		Conta c2 = new Conta();
		c2.setNumConta(2222222);
		c2.setDono("Creuza");
		c2.abrirConta("CP");
		c2.depositar(500);
		c2.sacar(1000);
		c2.fecharConta();
		c2.estadoAtual();
		
		sc.close();
	}

}
