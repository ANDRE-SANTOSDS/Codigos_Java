package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Duracao {

	public static void main(String[] args) {
		//QUESTÃO 10
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n1,minutos,segundos,horas;
        
        System.out.print("Digite os segundos: ");
        n1 = sc.nextInt();
        
        horas = n1/3600;
        minutos = (n1 % 3600)/60;
        segundos = (n1 % 3600)%60;
        System.out.println(horas+" : "+minutos+" : "+segundos+" ");
        
        
        sc.close();
	}

}
