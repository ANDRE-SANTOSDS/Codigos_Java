package heranca;

public class OutsourcedEmployee extends Employee {
	private Double additionalCharge;

	public OutsourcedEmployee() {

	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerhour, Double additionalCharge) {
		super(name, hours, valuePerhour);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}

	@Override
	public double payment() {
		// TODO Auto-generated method stub
		return super.payment() + 1.1 * additionalCharge;
	}

	@Override
	public String toString() {
		return "OutsourceEmployee [additionalCharge=" + additionalCharge + ", " + super.toString();
	}

}
