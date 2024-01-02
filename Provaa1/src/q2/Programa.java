package q2;

import java.time.LocalDate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter cliente data: ");
		Client cli = new Client();
		System.out.print("Name: ");
		cli.setName(sc.nextLine());
		System.out.print("Email: ");
		cli.setEmail(sc.nextLine());
		System.out.print("Birth date (DD/MM/YYYY):");
		LocalDate data = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		cli.setBirthDate(data);

		System.out.println("Enter order data:");
		Order order = new Order();
		order.setStatus(OrderStatus.PROCESSING);
		System.out.println("Status: " + order.getStatus());

		Product produto = new Product("TV", 1000.0);
		OrderItem orderItem = new OrderItem(2, 1000.0, produto);
		order.addItem(orderItem);
		Product produto2 = new Product("Mouse", 40.0);
		OrderItem orderItem2 = new OrderItem(4, 40.0, produto2);
		order.addItem(orderItem2);

		System.out.println();

		System.out.println("ORDER SUMMARY: ");
		LocalDateTime agora = LocalDateTime.now();
		order.setMoment(agora);
		System.out.println("Order moment: " + order.getMoment());
		System.out.println("Order status: " + order.getStatus());
		System.out.println(cli);
		System.out.println("Order Items: ");
		order.status();
		System.out.println(order);

		sc.close();
	}

}
