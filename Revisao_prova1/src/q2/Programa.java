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

		int n;
		System.out.print("How many items to this order? ");
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.print("Product name:");
			String name = sc.nextLine();
			System.out.print("Product price:");
			Double price = sc.nextDouble();
			System.out.print("Quantity: ");
			Integer Quantity = sc.nextInt();

			Product produto = new Product();
			OrderItem orderItem = new OrderItem();

			produto.setName(name);
			orderItem.setPrice(price);
			orderItem.setQuantity(Quantity);
			order.addItem(orderItem);

		}
		System.out.println();

		System.out.println("ORDER SUMMARY: ");
		LocalDateTime agora = LocalDateTime.now();
		order.setMoment(agora);
		System.out.println("Order moment: " + order.getMoment());
		System.out.println("Order status: " + order.getStatus());
		System.out.println(cli);
		System.out.println("Order Items:");

		sc.close();
	}

}
