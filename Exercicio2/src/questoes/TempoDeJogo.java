package questoes;

import java.util.Locale;
import java.util.Scanner;

public class TempoDeJogo {
    public static void main(String[] args) {
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    	
    	int horaInicial,horaFinal;
    	int duracao;
    	System.out.print("Digite a hora inicial: ");
    	horaInicial = sc.nextInt();
    	System.out.print("Digite a hora final: ");
    	horaFinal = sc.nextInt();
    	
    	if(horaInicial >= horaFinal){
    		duracao = (24 + horaFinal)-horaInicial;
    	}else {
    	    duracao = horaFinal - horaInicial;	
    	}
    	System.out.println("O jogo durou "+duracao+" hora(s)");
    	
    	sc.close();
    }
}
