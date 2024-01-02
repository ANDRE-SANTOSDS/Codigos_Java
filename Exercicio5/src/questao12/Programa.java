package questao12;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;
		int n2 = 0, n3 = 0, n4 = 0;
		double soma = 0, soma1 = 0, subtracao = 0, porcentagem = 0;

		System.out.print("Serao digitados dados de quantos produtos? ");
		n = sc.nextInt();

		ArrayList<Comerciante> comercio = new ArrayList<Comerciante>();

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.printf("Produto %d:\n", i + 1);
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Preco de compra: ");
			double precoCompra = sc.nextDouble();
			System.out.print("Preco de venda: ");
			double precoVenda = sc.nextDouble();

			Comerciante c = new Comerciante(nome, precoCompra, precoVenda);
			comercio.add(c);
		}
		for (int i = 0; i < n; i++) {
			porcentagem = ((comercio.get(i).getPrecoVenda() - comercio.get(i).getPrecoCompra())
					/ comercio.get(i).getPrecoCompra()) * 100;
			if (porcentagem < 10) {
				n2 = n2 + 1;
			} else if (porcentagem >= 10 && porcentagem <= 20) {
				n3 = n3 + 1;
			} else if (porcentagem > 20) {
				n4 = n4 + 1;
			}
		}
		System.out.println("");
		System.out.println("RELATORIO: ");

		System.out.println("Lucro abaixo de 10%: " + n2);
		System.out.println("Lucro entre 10% e 20%: " + n3);
		System.out.println("Lucro acima de 20%: " + n4);

		for (int i = 0; i < n; i++) {
			soma = soma + comercio.get(i).getPrecoCompra();
			soma1 = soma1 + comercio.get(i).getPrecoVenda();
			subtracao = soma - soma1;
		}
		System.out.printf("Valor total de compra: %.2f\n", soma);
		System.out.printf("Valor total de venda: %.2f\n", soma1);
		System.out.printf("Lucro total: %.2f\n", subtracao * -1);

		sc.close();
	}

}
