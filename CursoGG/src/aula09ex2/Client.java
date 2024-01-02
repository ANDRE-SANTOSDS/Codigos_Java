package aula09ex2;

import java.util.ArrayList;

public class Client {
	private String nome;
	private String endereco;
	private ArrayList<Pedido> pedido = new ArrayList<>();

	public Client(String nome, String endereco) {
		super();
		this.nome = nome;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public ArrayList<Pedido> getPedido() {
		return pedido;
	}

	public void setPedido(ArrayList<Pedido> pedido) {
		this.pedido = pedido;
	}
	
	public void addPedido(Pedido pedido) {
		this.pedido.add(pedido);
	}
	
	public void removePedido(Pedido pedido) {
		this.pedido.remove(pedido);
	}

	@Override
	public String toString() {
		return "Client [nome=" + nome + ", endereco=" + endereco + ",\n pedido=" + pedido + "]";
	}
	

}
