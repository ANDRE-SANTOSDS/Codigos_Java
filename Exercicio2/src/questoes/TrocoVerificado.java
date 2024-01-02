package questoes;

import java.util.Locale;
import java.util.Scanner;

public class TrocoVerificado {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double precoProduto,dinheiro;
		int quantidade;
		
		System.out.print("Digite o preço unitario dos produtos: ");
        precoProduto = sc.nextDouble();
        System.out.print("Digite a quantidade dos produtos: ");
        quantidade = sc.nextInt();
        System.out.print("Dinheiro recebido: ");
        dinheiro = sc.nextDouble();
        
        precoProduto = precoProduto * quantidade;
	    dinheiro = dinheiro - precoProduto;
      
    	if(dinheiro >= 0) {
    		System.out.println("Troco: "+dinheiro);
    	}else if(dinheiro < precoProduto) {
    		System.out.println("DINHEIRO INSUFICIENTE. FALTAM "+(-dinheiro)+" reais");
    	}
        
     sc.close();
	}
}
