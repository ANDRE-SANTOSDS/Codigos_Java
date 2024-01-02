package exercicio;

import java.util.ArrayList;

public class Cliente {
	private Integer id;
	private String nome;
	private String email;
	private String cpfOuCnpj;
	private TipoCliente tipo;
	private ArrayList<Pedido> pedido = new ArrayList<>();
	private ArrayList<Telefone> telefone = new ArrayList<>();
	private ArrayList<Endereco> endereco = new ArrayList<>();

	public Cliente(Integer id, String nome, String email, String cpfOuCnpj, TipoCliente tipo) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.cpfOuCnpj = cpfOuCnpj;
		this.tipo = tipo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpfOuCnpj() {
		return cpfOuCnpj;
	}

	public void setCpfOuCnpj(String cpfOuCnpj) {
		this.cpfOuCnpj = cpfOuCnpj;
	}

	public TipoCliente getTipo() {
		return tipo;
	}

	public void setTipo(TipoCliente tipo) {
		this.tipo = tipo;
	}

	public ArrayList<Pedido> getPedido() {
		return pedido;
	}

	public void setPedido(ArrayList<Pedido> pedido) {
		this.pedido = pedido;
	}

	public ArrayList<Telefone> getTelefone() {
		return telefone;
	}

	public void setTelefone(ArrayList<Telefone> telefone) {
		this.telefone = telefone;
	}

	public ArrayList<Endereco> getEndereco() {
		return endereco;
	}

	public void setEndereco(ArrayList<Endereco> endereco) {
		this.endereco = endereco;
	}

	public void addPedido(Pedido pedido) {
		this.pedido.add(pedido);
	}

	public void removePedido(Pedido pedido) {
		this.pedido.remove(pedido);
	}

	public void addTelefone(Telefone telefone) {
		this.telefone.add(telefone);
	}

	public void removeTelefone(Telefone telefone) {
		this.telefone.remove(telefone);
	}

	public void addEndereco(Endereco endereco) {
		this.endereco.add(endereco);
	}

	public void removeEndereco(Endereco endereco) {
		this.endereco.remove(endereco);
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome = " + nome + ", email = " + email + ", cpfOuCnpj = " + cpfOuCnpj
				+ ", tipo = " + tipo + "\n telefone = " + telefone + "\n endereco = " + endereco;
	}

}
