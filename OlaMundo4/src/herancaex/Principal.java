package herancaex;

import java.util.ArrayList;
import java.util.List;


public class Principal {

	public static void main(String[] args) {
		var taxPayer = new ArrayList<TaxPayer>();
		  taxPayer.add(new Individual("Alex", 50000.00, 2000.0));
		  taxPayer.add(new Company("SoftTech", 400000.00, 25));
		  taxPayer.add(new Individual("Bob", 120000.0, 1000.0));
		  
		  for (TaxPayer taxPayer2 : taxPayer) {
			System.out.println(taxPayer2);
		}
		  System.out.println("Total = "+totalTax(taxPayer));
	}
	
	public static double totalTax(List<TaxPayer> peyers) {
		double total = 0.0;
		for (TaxPayer taxPayer : peyers) {
			total = total + taxPayer.tax();
		}
		return total;
	}

}
