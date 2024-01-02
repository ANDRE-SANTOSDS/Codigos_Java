package aula12;

public abstract class Animal {
	protected Double pseo;
	protected Integer idade;
	protected Integer membros;


	public Double getPseo() {
		return pseo;
	}

	public void setPseo(Double pseo) {
		this.pseo = pseo;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Integer getMembros() {
		return membros;
	}

	public void setMembros(Integer membros) {
		this.membros = membros;
	}

	public abstract void locomover();

	public abstract void alimentar();

	public abstract void emitirSom();
}
