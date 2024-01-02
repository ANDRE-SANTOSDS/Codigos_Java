package questao4;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
	   Locale.setDefault(Locale.US);
	   Scanner sc = new Scanner(System.in);
	  
	   
	   System.out.print("Qual o valor do dólar? ");
	   double valorDolar = sc.nextDouble();
	   System.out.print("Quantos dólares serão comprados? ");
	   double quantidade = sc.nextDouble();
	   
	   CurrencyConverter CC = new CurrencyConverter(valorDolar,quantidade);
	   System.out.println(CC);
	   
	   
	   sc.close();
	}

}
