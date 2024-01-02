package questoes;

import java.util.Locale;
import java.util.Scanner;

public class Lanchonete {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
        
	int produtos,quantidade;
    System.out.print("Digite o codigo do Produto(1 a 5): ");
	produtos = sc.nextInt();
	switch (produtos) {
		case 1:
			double produto1 = 5.00;
			System.out.print("Digite a quantidade comprada: ");
			quantidade = sc.nextInt();
			produto1 = produto1 * quantidade;
			System.out.printf("Valor a pagar: R$ %.2f\n", produto1);
			break;
		case 2:
			double produto2 = 3.50;
			System.out.print("Digite a quantidade comprada: ");
			quantidade = sc.nextInt();
			produto2 = produto2 * quantidade;
			System.out.printf("Valor a pagar: R$ %.2f\n", produto2);
			break;
		case 3:
			double produto3 = 4.80;
			System.out.print("Digite a quantidade comprada: ");
			quantidade = sc.nextInt();
			produto3 = produto3 * quantidade;
			System.out.printf("Valor a pagar: R$ %.2f\n", produto3);
			break;
		case 4:
			double produto4 = 8.90;
			System.out.print("Digite a quantidade comprada: ");
			quantidade = sc.nextInt();
			produto4 = produto4 * quantidade;
			System.out.printf("Valor a pagar: R$ %.2f\n", produto4);
			break;
		case 5:
			double produto5 = 7.32;
			 System.out.print("Digite a quantidade comprada: ");
			 quantidade = sc.nextInt();
			 produto5 = produto5 * quantidade;
			 System.out.printf("Valor a pagar: R$ %.2f\n", produto5);
			break;
		default:
			System.out.println("Numero invalido!");
			break;
		 }
        
        sc.close();
	}

}
