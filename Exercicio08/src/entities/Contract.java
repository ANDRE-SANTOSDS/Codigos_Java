package entities;

import java.time.LocalDate;
import java.util.ArrayList;

public class Contract {
	private Integer number;
	private LocalDate date;
	private double totalValue;
	private ArrayList<Installment> installment = new ArrayList<>();

	public Contract() {

	}

	public Contract(Integer number, LocalDate date, double totalValue) {
		super();
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(double totalValue) {
		this.totalValue = totalValue;
	}

	public ArrayList<Installment> getInstallment() {
		return installment;
	}

	public void setInstallment(ArrayList<Installment> installment) {
		this.installment = installment;
	}

	public void addInstallment(Installment installment) {
		this.installment.add(installment);
	}

	public void removeInstallment(Installment installment) {
		this.installment.remove(installment);
	}

	public void parcelas() {
		for (Installment ins : installment) {
			System.out.println(ins);
		}
	}

	@Override
	public String toString() {
		return "Contract{" + "number=" + number + ", date=" + date + ", totValue=" + totalValue + ", installments="
				+ installment + '}';
	}

}
