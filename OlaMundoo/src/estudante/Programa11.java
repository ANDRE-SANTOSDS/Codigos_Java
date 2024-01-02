package estudante;

import java.util.Locale;

public class Programa11 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double x = 3.00;
		double y = 4.00;
		double z = 5.00;
		double a,b,c;
    
		a = Math.sqrt(x);//Math.sqrt é para calcular a raiz quadrada//
		b = Math.sqrt(y);
		c = Math.sqrt(25.0);
		System.out.println("Raiz quadrada de "+x+" = "+a);
		System.out.printf("Raiz quadrada de %.2f = %.2f\n",y,b);
		System.out.println("Raiz quadrada de 25.0 = "+c);
		System.out.println("");
		
		a = Math.pow(x , y);//Math.pow é para calcular a potanciação(numero elevado a algum numero)
		b = Math.pow(x , 2.0);
		c = Math.pow( 5.0,2.0 );
		System.out.println(x +" elevado a "+y+" = "+a);
		System.out.printf("%.2f elevado a 2.00 = %.2f\n", x,b);
		System.out.printf("%.2f elevado a 2.00 = %.2f\n\n",z,c);
		
		a = Math.abs(y);//Math.abs é para calcular o valor absoluto
		b = Math.abs(z);
		System.out.println("Valor absoluto de "+y+"  = "+a);
		System.out.println("Valor absoluto de "+z+" = "+b);
		
	}
}
