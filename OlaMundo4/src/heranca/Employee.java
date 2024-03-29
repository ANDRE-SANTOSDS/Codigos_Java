package heranca;

public class Employee {
	private String name;
	private Integer hours;
	private Double valuePerHour;

	public Employee() {

	}

	public Employee(String name, Integer hours, Double valuePerhour) {
		super();
		this.name = name;
		this.hours = hours;
		this.valuePerHour = valuePerhour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerhour) {
		this.valuePerHour = valuePerhour;
	}

	public double payment() {
       return this.valuePerHour * hours;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", hours=" + hours + ", valuePerhour=" + valuePerHour +"Payment: "+payment()+"]";
	}

}
