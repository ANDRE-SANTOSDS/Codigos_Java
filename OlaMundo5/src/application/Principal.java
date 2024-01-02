package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;

public class Principal {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
        
		
		System.out.print("Digite a largura: ");
		Double width = sc.nextDouble();
		System.out.print("Digite a altura: ");
		double height = sc.nextDouble();
		Rectangle rectangle = new Rectangle("Vermelho",width,height);
		System.out.print(rectangle);
		
		System.out.println("\n");
		
		System.out.print("Digite o valor do radius: ");
        double radius = sc.nextDouble();
		Circle circle = new Circle("Azul",radius);
		System.out.println(circle);
		
		sc.close();
	}

}
