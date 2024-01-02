package estudante;

public class Programa012 {

	public static void main(String[] args) {
		double preco = 34.5;
		double desconto;
		if(preco < 20.0) {
			desconto = preco * 0.1;
			System.out.println("Desconto = "+desconto);
		}else {
			desconto = preco * 0.5;
			System.out.println("Desconto = "+desconto);
		}

	}

}
