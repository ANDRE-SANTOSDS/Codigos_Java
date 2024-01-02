package exercicio;

import java.util.ArrayList;

public class ItemPedido {
	private Double desconto;
	private Integer quantidade;
	private Double preco;
	private ArrayList<Produto> produto = new ArrayList<>();

	public ItemPedido(Double desconto, Integer quantidade, Double preco) {
		super();
		this.desconto = desconto;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public ArrayList<Produto> getProduto() {
		return produto;
	}

	public void setProduto(ArrayList<Produto> produto) {
		this.produto = produto;
	}

	public void addProduto(Produto produto) {
		this.produto.add(produto);
	}

	public void removeProduto(Produto produto) {
		this.produto.remove(produto);
	}
	
	public double subTotal() {
		return this.quantidade * this.preco;
	}

	@Override
	public String toString() {
		return "ItemPedido [desconto=" + desconto + ", quantidade=" + quantidade + ", preco=" + preco +""+produto.getFirst().getId() +", produto nome="
				+ produto.getFirst().getNome() + ", subtotal="+subTotal()+", Categoria="+produto.getFirst().getCategoria() +"]";
	}

}
