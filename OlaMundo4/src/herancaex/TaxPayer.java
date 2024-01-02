package herancaex;

public abstract class TaxPayer {
    private String name;
    private Double anualincome;
    
    public abstract double tax();

	public TaxPayer(String name, Double anualincome) {
		super();
		this.name = name;
		this.anualincome = anualincome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualincome() {
		return anualincome;
	}

	public void setAnualincome(Double anualincome) {
		this.anualincome = anualincome;
	}

	@Override
	public String toString() {
		return "TaxPayer [name=" + name + ", anualincome=" + anualincome + ", tax()=" + tax() + "]";
	}
    
    
	
}
