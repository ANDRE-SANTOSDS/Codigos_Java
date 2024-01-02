package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Pagamento {

	public static void main(String[] args) {
		//QUESTÃO 7
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double valorHora;
        int horaTrabalhada;
        String nome,sobrenome;
        System.out.print("Digite seu primeiro nome: ");
        nome = sc.next();
        System.out.print("Digite seu segundo nome: ");
        sobrenome = sc.next();
        System.out.print("Digite o valor por hora: ");
        valorHora = sc.nextDouble();
        System.out.print("Digite as horas trabahadas: ");
        horaTrabalhada = sc.nextInt();
        
        valorHora = valorHora * horaTrabalhada;
        System.out.println("O pagamento para "+nome+" "+sobrenome+" deve ser "+valorHora);
        
        sc.close();
	}

}
