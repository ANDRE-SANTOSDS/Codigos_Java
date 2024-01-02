package aula09ex1;

public class Livro implements Publicacao {
	private String titulo;
	private String autor;
	private Integer totalPaginas;
	private Integer pagAtual;
	private boolean aberto;
	private Pessoa leitor;

	public String detalhes() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + "\n totalPaginas=" + totalPaginas + ", pagAtual="
				+ pagAtual + ", aberto=" + aberto + "\n leitor=" + leitor.getNome() + ", Idade do leitor = "
				+ leitor.getIdade() + ", Sexo do leitor = " + leitor.getSexo() + "]";
	}

	public Livro(String titulo, String autor, Integer totalPaginas, Pessoa leitor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.totalPaginas = totalPaginas;
		this.aberto = false;
		this.pagAtual = 0;
		this.leitor = leitor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Integer getTotalPaginas() {
		return totalPaginas;
	}

	public void setTotalPaginas(Integer totalPaginas) {
		this.totalPaginas = totalPaginas;
	}

	public Integer getPagAtual() {
		return pagAtual;
	}

	public void setPagAtual(Integer pagAtual) {
		this.pagAtual = pagAtual;
	}

	public boolean isAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}

	@Override
	public void abrir() {
		// TODO Auto-generated method stub
		this.aberto = true;
	}

	@Override
	public void fechar() {
		// TODO Auto-generated method stub
		this.aberto = false;
	}

	@Override
	public void folhear(int p) {
		// TODO Auto-generated method stub
		if(p > this.totalPaginas) {
			pagAtual = 0;
		}else {
			this.pagAtual = p;
		}
	}

	@Override
	public void AvancarPag() {
		// TODO Auto-generated method stub
		this.pagAtual++;
	}

	@Override
	public void voltarPag() {
		// TODO Auto-generated method stub
		this.pagAtual--;
	}

}
