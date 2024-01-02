package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Terreno {

	public static void main(String[] args) {
		//QUESTÃO 1
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura, comprimento,metroQuadrado,area,preco;
        
		System.out.print("Digite a largura do terreno: ");
		largura = sc.nextDouble();
		System.out.print("Digite o comprimento do terreno: ");
		comprimento = sc.nextDouble();
		System.out.print("Digite o valor do metro quadrado: ");
		metroQuadrado = sc.nextDouble();
		
		area = largura * comprimento;
		preco = metroQuadrado * area;
		
		System.out.printf("Area do terreno = %.2f\n", area);
		System.out.printf("Preço do terreno = %.2f\n", preco);
		
		sc.close();
	}

}
