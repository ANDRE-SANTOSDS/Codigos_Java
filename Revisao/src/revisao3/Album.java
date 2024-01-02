package revisao3;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Album {
	private Integer id;
	private String titulo;
	private LocalDateTime instante;
	private ArrayList<Foto> foto = new ArrayList<>();

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

	public void addFoto(Foto foto) {
		this.foto.add(foto);
	}

	public void removePFoto(Foto foto) {
		this.foto.remove(foto);
	}

	@Override
	public String toString() {
		return "Album [id = " + id + ", titulo = " + titulo + ", instante = " + instante + ", " + foto + "]";
	}

}
