package heranca;

import java.util.ArrayList;
import java.util.Locale;

public class Principal {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		ArrayList<Employee> employees = new ArrayList<>();

		employees.add(new Employee("Maria", 10, 20.0));
		employees.add(new Employee("Andre", 12, 30.0));
		employees.add(new OutsourcedEmployee("Joao", 10, 20.0, 15.0));
		employees.add(new OutsourcedEmployee("Jana", 13, 30.0, 15.0));

		for (Employee employee : employees) {
			System.out.println(employee);
		}

		System.out.println("Total payment = " + totalPayment(employees));

		plusValuePerHouts(employees);
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}

	public static double totalPayment(ArrayList<Employee> employees) {
		double total = 0.0;
		for (Employee employee : employees) {
			total += employee.payment();
		}

		return total;
	}

	public static void plusValuePerHouts(ArrayList<Employee> employees) {
		for (Employee employee : employees) {
			if (employee instanceof OutsourcedEmployee) {
				employee.setValuePerHour(employee.getValuePerHour() + 20.0);
			} else {
				employee.setValuePerHour(employee.getValuePerHour() + 10.0);
			}
		}
	}
}