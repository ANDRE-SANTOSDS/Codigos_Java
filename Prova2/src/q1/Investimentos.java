package q1;

public class Investimentos implements Comparable<Investimentos>{
	private String cpf;
	private String investimentos;
	private Double taxa;
	private Integer tempoDias;
	private Double capitalInicial;

	public Investimentos(String cpf, String investimentos, Double taxa, Integer tempoDias, Double capitalInicial) {
		super();
		this.cpf = cpf;
		this.investimentos = investimentos;
		this.taxa = taxa;
		this.tempoDias = tempoDias;
		this.capitalInicial = capitalInicial;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getInvestimentos() {
		return investimentos;
	}

	public void setInvestimentos(String investimentos) {
		this.investimentos = investimentos;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}

	public Integer getTempoDias() {
		return tempoDias;
	}

	public void setTempoDias(Integer tempoDias) {
		this.tempoDias = tempoDias;
	}

	public Double getCapitalInicial() {
		return capitalInicial;
	}

	public void setCapitalInicial(Double capitalInicial) {
		this.capitalInicial = capitalInicial;
	}
	
	public double taxaReal() {
		double tr = taxa/100* 4.9/100;
		return tr;
	}

	public double valorBruto() {
		double v = capitalInicial *  Math.pow((1+taxaReal()),tempoDias/360 );
		return v;
	}
	
	public double juros() {
		double j =valorBruto() - capitalInicial;
		return j;
	}
	
	public Double valorLiquido() {
		if(investimentos.equals("CDB")){
			double valorIR= 0.0;
			if(tempoDias <= 180) {
				valorIR = 0.225;
			}
			else if(tempoDias >= 181 && tempoDias <= 360){
				valorIR = 0.2;
			}else if(tempoDias >= 361 && tempoDias <= 720) {
				valorIR = 0.175;
			}else if(tempoDias > 720) {
				valorIR = 0.15;
			}
			
			return valorBruto()-juros() * valorIR;
		}
		else {
			return valorBruto();
		}
	}
	
	@Override
	public int compareTo(Investimentos o) {
		
		return -valorLiquido().compareTo(o.valorLiquido());
	}

	@Override
	public String toString() {
		return "" + cpf + ", " + investimentos + ", " + taxa + ", "
				+ tempoDias + ", " + capitalInicial + ", "+valorBruto()+", "+juros()+", "+valorLiquido();
	}
	
}
