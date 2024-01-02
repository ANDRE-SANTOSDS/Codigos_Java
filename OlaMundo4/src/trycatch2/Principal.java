package trycatch2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		var dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("Room number: ");
		Integer roomNumber = sc.nextInt();
		sc.nextLine();

		System.out.println("Check-in date(dd/MM/yyyy): ");
		LocalDate checkin = LocalDate.parse(sc.nextLine(), dtf);

		System.out.println("Check-in date(dd/MM/yyyy): ");
		LocalDate checkout = LocalDate.parse(sc.nextLine(), dtf);

		if (checkout.isAfter(checkin)) {
			Reservation reservation = new Reservation(roomNumber, checkin, checkout);
			System.out.println(reservation);

			System.out.println("Enter data to update the reservation: ");

			System.out.println("Check-in date(dd/MM/yyyy): ");
			checkin = LocalDate.parse(sc.nextLine(), dtf);

			System.out.println("Check-in date(dd/MM/yyyy): ");
			checkout = LocalDate.parse(sc.nextLine(), dtf);

			LocalDate now = LocalDate.now();// hoje

			if (checkin.isBefore(now) || checkout.isBefore(now)) {
				System.out.println("Error in reservation: Reservation dates for update must be future dates");
			} else if (!checkout.isAfter(checkin)) {
				System.out.println("Error in reservation: check-out date must be afte check-in date");
			} else {
				reservation.updateDates(checkin, checkout);
				System.out.println(reservation);
			}
		} else {
			System.out.println("Error in reservation: check-out date must be afte check-in date");
		}

		sc.close();
	}

}
