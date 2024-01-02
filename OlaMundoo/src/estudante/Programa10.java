package estudante;

import java.util.Locale;
import java.util.Scanner;

public class Programa10 {
   public static void main(String[] args) {
	   Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
       int dia;
       System.out.print("Digite um numero de (1 a 7): ");
       dia = sc.nextInt();
       
       if(dia == 1) {
       	System.out.println("Domingo");
       }else if(dia == 2) {
       	System.out.println("Segunda");
       }else if(dia == 3) {
       	System.out.println("Terça");
       }else if(dia == 4) {
       	System.out.println("Quarta");
       }else if(dia == 5) {
       	System.out.println("Quinta");
       }else if(dia == 6) {
       	System.out.println("Sexta");
       }else if(dia == 7) {
       	System.out.println("Sabado");
       }else {
       	System.out.println("Numero invalido!");
       }
       
       sc.close();
   }
}
