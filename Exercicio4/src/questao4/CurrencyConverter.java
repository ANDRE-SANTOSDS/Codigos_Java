package questao4;

public class CurrencyConverter {
	private double valorDolar;
	private double quantidade;
	private static final double porcentagem = 0.06;

	public CurrencyConverter(double valorDolar, double quantidade) {
		super();
		this.valorDolar = valorDolar;
		this.quantidade = quantidade;
	}

	public static double valorPagar(double valorDolar, double quantidade) {
		return (valorDolar * quantidade * porcentagem) + (valorDolar * quantidade);
	}

	public String toString() {
		return String.format("Valor a ser pago em reais = %.2f\n", valorPagar(valorDolar, quantidade));
	}

}
