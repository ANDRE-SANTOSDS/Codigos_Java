package q1;

import java.time.LocalDateTime;

public class Album {
	private Integer id;
	private String titulo;
	private LocalDateTime instante;

	public Album(Integer id, String titulo, LocalDateTime instante) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.instante = instante;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public LocalDateTime getInstante() {
		return instante;
	}

	public void setInstante(LocalDateTime instante) {
		this.instante = instante;
	}

	@Override
	public String toString() {
		return "Album [id=" + id + ", titulo=" + titulo + ", instante=" + instante + "]";
	}

}
