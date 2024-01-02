package q1;

import java.time.LocalDateTime;

public class Foto {
	private String uri;
	private LocalDateTime instante;
	private Postagem postagem;

	public Foto(String uri, LocalDateTime instante, Postagem postagem) {
		super();
		this.uri = uri;
		this.instante = instante;
		this.postagem = postagem;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public LocalDateTime getInstante() {
		return instante;
	}

	public void setInstante(LocalDateTime instante) {
		this.instante = instante;
	}

	public Postagem getPostagem() {
		return postagem;
	}

	public void setPostagem(Postagem postagem) {
		this.postagem = postagem;
	}

	@Override
	public String toString() {
		return "Foto [uri=" + uri + ", instante=" + instante + ", postagem=" + postagem + "]";
	}

}
