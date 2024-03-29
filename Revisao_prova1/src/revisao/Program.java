package revisao;

import java.time.LocalDateTime;

public class Program {

	public static void main(String[] args) {
		Cidade c1 = new Cidade("Belém","http://dominio.com","Pará");
		Restaurante r1 = new Restaurante("Padrao",20.00,c1);
		Restaurante r2 = new Restaurante("Point do Açaí",120.0,c1);
		
		Hotel h1 = new Hotel("Ibis",250.0,c1);
		Hotel h2 = new Hotel("Hilton",450.0,c1);
		Hotel h3 = new Hotel("Pousada",350.0,c1);
		
		PacoteTuristico p1 = new PacoteTuristico("Lalaland Belém/PA",LocalDateTime.parse("2023-10-04T10:00:00"),7,3,c1);
		p1.setRestaurante(r1);
		p1.setRestaurante(r2);
		p1.addHotel(h1);
		p1.addHotel(h2);
		p1.addHotel(h3);
		
		System.out.println(p1);
	}

}
