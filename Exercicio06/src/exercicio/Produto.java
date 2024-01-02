package exercicio;

import java.util.ArrayList;

public class Produto {
	private Integer id;
	private String nome;
	private Double preco;
	private ArrayList<Categoria> categoria = new ArrayList<>();

	public Produto(Integer id, String nome, Double preco) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
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

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public ArrayList<Categoria> getCategoria() {
		return categoria;
	}

	public void setCategoria(ArrayList<Categoria> categoria) {
		this.categoria = categoria;
	}

	public void addCategoria(Categoria categoria) {
		this.categoria.add(categoria);
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", preco=" + preco + ", categoria=" + categoria + "]";
	}
	
	
}
