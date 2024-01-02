package exercicio;

import java.time.LocalDate;

public class PagamentoComBoleto extends Pagamento {
	private LocalDate dataVencimento;
	private LocalDate dataPagamento;

	public PagamentoComBoleto(Integer id, EstadoPagamento estado, LocalDate dataVencimento, LocalDate dataPagamento) {
		super(id, estado);
		this.dataVencimento = dataVencimento;
		this.dataPagamento = dataPagamento;
	}

	public LocalDate getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(LocalDate dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public LocalDate getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(LocalDate dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	@Override
	public void pagar(double valorPago) {
		

	}

}
