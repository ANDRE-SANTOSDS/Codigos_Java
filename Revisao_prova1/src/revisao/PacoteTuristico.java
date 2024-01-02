package revisao;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class PacoteTuristico {
	private String descricao;
	private LocalDateTime dataViagem;
	private Integer diasPermanencia;
	private Integer reifeicoesPorDia;
	private Cidade cidade;
	private Restaurante restaurante;
	private ArrayList<Hotel> hoteis = new ArrayList<Hotel>();

	public PacoteTuristico(String descricao, LocalDateTime dataViagem, Integer diasPermanencia,
			Integer reifeicoesPorDia, Cidade cidade, Restaurante restaurante) {
		super();
		this.descricao = descricao;
		this.dataViagem = dataViagem;
		this.diasPermanencia = diasPermanencia;
		this.reifeicoesPorDia = reifeicoesPorDia;
		this.cidade = cidade;
		this.restaurante = restaurante;
	}

	public PacoteTuristico(String descricao, LocalDateTime dataViagem, Integer diasPermanencia,
			Integer reifeicoesPorDia, Cidade cidade) {
		super();
		this.descricao = descricao;
		this.dataViagem = dataViagem;
		this.diasPermanencia = diasPermanencia;
		this.reifeicoesPorDia = reifeicoesPorDia;
		this.cidade = cidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDateTime getDataViagem() {
		return dataViagem;
	}

	public void setDataViagem(LocalDateTime dataViagem) {
		this.dataViagem = dataViagem;
	}

	public Integer getDiasPermanencia() {
		return diasPermanencia;
	}

	public void setDiasPermanencia(Integer diasPermanencia) {
		this.diasPermanencia = diasPermanencia;
	}

	public Integer getReifeicoesPorDia() {
		return reifeicoesPorDia;
	}

	public void setReifeicoesPorDia(Integer reifeicoesPorDia) {
		this.reifeicoesPorDia = reifeicoesPorDia;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public Restaurante getRestaurante() {
		return restaurante;
	}

	public void setRestaurante(Restaurante restaurante) {
		this.restaurante = restaurante;
	}

	public ArrayList<Hotel> getHoteis() {
		return hoteis;
	}

	public void setHoteis(ArrayList<Hotel> hoteis) {
		this.hoteis = hoteis;
	}
	
	public void addHotel(Hotel h) {
		hoteis.add(h);
	}
	public void removeHotel(Hotel h) {
		hoteis.remove(h);
	}

	@Override
	public String toString() {
		return "PacoteTuristico [descricao=" + descricao + ", dataViagem=" + dataViagem + ", diasPermanencia="
				+ diasPermanencia + ", reifeicoesPorDia=" + reifeicoesPorDia + ", cidade=" + cidade + ", restaurante="
				+ restaurante + ", hoteis=" + hoteis + "]";
	}
	

}
