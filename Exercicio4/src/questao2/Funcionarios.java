package questao2;

public class Funcionarios {
	private String name;
	private double grossSalary;
	private double tax;

	public Funcionarios(String name, double grossSalary, double tax) {
		super();
		this.name = name;
		this.grossSalary = grossSalary;
		this.tax = tax;
	}

	public double netSalary() {
		return grossSalary - tax;
	}

	public double increaseSalary(double percentage) {
		this.grossSalary = (grossSalary * percentage) / 100 + grossSalary - tax;
		System.out.printf("Dados atualizados: %s, $ %.2f\n", this.name, this.grossSalary);
		return grossSalary;
	}

	public String toString() {
		return String.format("%.2f", netSalary());
	}

}
