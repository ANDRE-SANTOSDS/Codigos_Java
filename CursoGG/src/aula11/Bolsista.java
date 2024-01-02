package aula11;

public final class Bolsista extends Aluno {
	private Double bolsa;

	public void renovarBolsa() {
		System.out.println("Renovvando bolsa de " + getNome());
	}
	
	public void pagaMensalidade() {
		System.out.println(getNome()+" é bolsista! Pagamento facilitado");
	}

	public Double getBolsa() {
		return bolsa;
	}

	public void setBolsa(Double bolsa) {
		this.bolsa = bolsa;
	}

	@Override
	public String toString() {
		return ""+super.toString()+" Bolsista [bolsa=" + bolsa + "]";
	}
	
}
