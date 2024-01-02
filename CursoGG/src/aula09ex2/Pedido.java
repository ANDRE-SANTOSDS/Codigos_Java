package aula09ex2;

public class Pedido {
	private Integer nIdentificacao;
	private String produto;
	private double total;
	private boolean entregue;

	public Pedido() {

	}

	public Pedido(Integer nIdentificacao,String produto, double total) {
		super();
		this.nIdentificacao = nIdentificacao;
		this.produto = produto;
		this.total = total;
	}

	public Integer getnIdentificacao() {
		return nIdentificacao;
	}

	public void setnIdentificacao(Integer nIdentificacao) {
		this.nIdentificacao = nIdentificacao;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public boolean isEntregue() {
		return entregue;
	}

	public void setEntregue(boolean entregue) {
		this.entregue = entregue;
	}
	public void pEntregue() {
		this.entregue = true;
	}
	public void pNEntregue() {
		this.entregue = false;
	}

	@Override
	public String toString() {
		return "Pedido [nIdentificacao=" + nIdentificacao + ", produto=" + produto + ", total=" + total + ", entregue="
				+ entregue + "]";
	}
	
}
