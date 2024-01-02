package ex1;

public class Pessoa implements Comparable<Pessoa> {
	private String nome;
	private Double idade;

	public Pessoa(String nome, Double idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getIdade() {
		return idade;
	}

	public void setIdade(Double idade) {
		this.idade = idade;
	}

	@Override
	public int compareTo(Pessoa anotherPessoa) {
		// TODO Auto-generated method stub
		return this.idade.compareTo(anotherPessoa.idade);
	}
}
