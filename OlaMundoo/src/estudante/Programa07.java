package estudante;

import java.util.Scanner;

public class Programa07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char sexo;
		
        System.out.printf("Digite seu genero(M ou F): ");
        sexo = sc.next().charAt(0);
        System.out.println("Letra: "+sexo);
        
        sc.close();
	}

}
