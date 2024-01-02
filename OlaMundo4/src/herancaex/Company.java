package herancaex;

public class Company extends TaxPayer {
	private Integer numberOfEmployees;

	public Company(String name, Double anualincome, Integer numberOfEmployees) {
		super(name, anualincome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double tax() {
		double p = 0.0;
		if(getNumberOfEmployees() > 10) {
			p = (getAnualincome() * 14)/100;
		}else if(getNumberOfEmployees() <= 10){
			p = (getAnualincome() * 16/100);
		}
		return p;
		
	}

	@Override
	public String toString() {
		return "Company [numberOfEmployees=" + numberOfEmployees + ", tax()=" + tax() + "]";
	}
	

}
