package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import services.ContractService;
import services.PaypalService;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre os dados do contrato:");
		System.out.print("Numero:");
		Integer number = sc.nextInt();
		sc.nextLine();
		System.out.print("Data (dd/mm/yyyy):");
		LocalDate data = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.print("Valor do contrato:");
		Double valor = sc.nextDouble();
		sc.nextLine();
		System.out.print("Entre com o numero de parcelas:");
		Integer nParcelas = sc.nextInt();

		Contract contrato = new Contract(number,data, valor);
		PaypalService pay = new PaypalService();
		ContractService contractService = new ContractService(pay);

		contractService.processContract(contrato, nParcelas);
        System.out.println("Parcelas:");
		contrato.parcelas();

		sc.close();
	}

}
