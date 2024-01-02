package exercicio;

public abstract class Pagamento {
	private Integer id;
	private EstadoPagamento estado;

	public Pagamento() {
		
	}
	
	public Pagamento(Integer id, EstadoPagamento estado) {
		super();
		this.id = id;
		this.estado = estado;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public EstadoPagamento getEstado() {
		return estado;
	}

	public void setEstado(EstadoPagamento estado) {
		this.estado = estado;
	}
	
	public abstract void pagar(double valorPago);

	@Override
	public String toString() {
		return "Pagamento [id=" + id + ", estado=" + estado + "]";
	}
}
