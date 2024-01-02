package aula11;

public final class Professor extends Pessoa{

	private String especialista;
	private Double salario;
	
	public void receberAumento(Double aum) {
		this.salario += aum;
	}

	public String getEspecialista() {
		return especialista;
	}

	public void setEspecialista(String especialista) {
		this.especialista = especialista;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return ""+super.toString()+" Professor [especialista=" + especialista + ", salario=" + salario + "]";
	}
	
	
}
