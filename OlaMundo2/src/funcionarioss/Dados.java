package funcionarioss;

public class Dados {
	public String name;
    public double GrossSalary;
    public double tax;
    
    public double netSalary() {
    	return GrossSalary - tax;
    }
    public double increaseSalary(double percentage) {
    	return GrossSalary = GrossSalary + GrossSalary * percentage;
    }
}
