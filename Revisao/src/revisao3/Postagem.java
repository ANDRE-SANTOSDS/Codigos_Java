package revisao3;

import java.time.LocalDateTime;

public class Postagem {
	private Integer id;
	private String texto;
	private LocalDateTime instante;

	public Postagem(Integer id, String texto, LocalDateTime instante) {
		super();
		this.id = id;
		this.texto = texto;
		this.instante = instante;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public LocalDateTime getInstante() {
		return instante;
	}

	public void setInstante(LocalDateTime instante) {
		this.instante = instante;
	}

	@Override
	public String toString() {
		return "Postagem [id=" + id + ", texto=" + texto + ", instante=" + instante + "]";
	}

}
