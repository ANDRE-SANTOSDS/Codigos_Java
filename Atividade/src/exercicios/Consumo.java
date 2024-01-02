package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Consumo {

	public static void main(String[] args) {
		//QUESTÃO 8
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
        
		int distancia;
		double combustivelGasto;
		
		System.out.print("Digite a distancia percorrida: ");
		distancia = sc.nextInt();
		System.out.print("Digite a quantidade de combustivel gasto: ");
		combustivelGasto = sc.nextDouble();
		
		double consumo =  distancia / combustivelGasto;
		System.out.printf("Consumo medio = %.3f\n", consumo);
		
		sc.close();
	}

}
