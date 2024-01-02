package services;

import java.time.LocalDate;

import entities.Contract;
import entities.Installment;

public class ContractService {
	private OnlinePaymentService service;

	public ContractService() {
	}

	public ContractService(OnlinePaymentService service) {
		this.service = service;
	}

	public void processContract(Contract contract, Integer months) {
		double valueBasic = contract.getTotalValue() / months;

		for (int i = 1; i <= months; i++) {
			LocalDate dueDate = contract.getDate().plusMonths(i);

			double interest = service.interest(valueBasic, i);
			double imposto = service.paymentFree(valueBasic + interest);
			double amount = (valueBasic + interest + imposto);

			contract.addInstallment(new Installment(dueDate, amount));
		}

	}
}
