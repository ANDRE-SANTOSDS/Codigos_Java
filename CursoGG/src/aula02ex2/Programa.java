package aula02ex2;

public class Programa {

	public static void main(String[] args) {
       Celular cel1 = new Celular();
       cel1.marca = "Apple";
       cel1.sistemaOP = "IOS";
       cel1.nomeAP = "iPhone 7";
       cel1.cor = "Preto";
       cel1.altura = 13.8;
       cel1.largura = 6.7;
       cel1.status();
       
       System.out.println();
       
       Celular cel2 = new Celular();
       cel2.marca = "Motorola";
       cel2.sistemaOP = "Android";
       cel2.nomeAP = "Moto g31";
       cel2.cor = "Preto";
       cel2.altura = 16.19;
       cel2.largura = 7.39;
       cel2.status();
	}

}
