package aula05ex;

public class Conta2 {
	private String nome;
	private String cpf;
	private int senha;
	private double saldo;
	private double vSacado;
	private double saldA;

	public Conta2(String nome, String cpf, int senha, double saldo) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double saldAtual(double sq) {
		return this.saldA = this.saldo + sq;
	}

	public double valorSacado(double sq) {
		return this.vSacado = sq;
	}

	public double valorDps(double sq) {
		return this.saldo -= sq;
	}

	public void status() {
		System.out.println();
		System.out.println("Nome: " + getNome());
		System.out.println("CPF: " + getCpf());
		System.out.println("Senha: " + getSenha());
		System.out.println("Saldo da conta: " + this.saldA);
		System.out.println("Valor sacado: " + this.vSacado);
		System.out.println("Saldo depois do saque: " + getSaldo());
	}

}
