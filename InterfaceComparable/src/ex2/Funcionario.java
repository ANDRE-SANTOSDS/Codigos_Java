package ex2;

public class Funcionario implements Comparable<Funcionario> {
	private String nome;
	private Double salario;

	public Funcionario() {

	}

	public Funcionario(String nome, Double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public int compareTo(Funcionario o) {
		// Forma crescente
		return this.salario.compareTo(o.getSalario());

		// Forma decrescente
		// -return this.salario.compareTo(o.getSalario());

		// return this.nome.compareTo(o.getNome());
	}

}
