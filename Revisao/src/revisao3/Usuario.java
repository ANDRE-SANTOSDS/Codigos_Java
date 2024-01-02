package revisao3;

import java.time.LocalDate;
import java.util.ArrayList;

public class Usuario {
	private Integer id;
	private String nome;
	private String email;
	private LocalDate nascimento;
	private String genero;
	private String webSite;
	private String telefone;
	private String uriFoto;
	private ArrayList<Foto> foto = new ArrayList<Foto>();
	private ArrayList<Album> album = new ArrayList<Album>();
	private ArrayList<Postagem> postagem = new ArrayList<>();
	private ArrayList<Usuario> seguidor = new ArrayList<>();
	private ArrayList<Usuario> seguindo = new ArrayList<>();

	public Usuario(Integer id, String nome, String email, LocalDate nascimento, String genero, String webSite,
			String telefone, String uriFoto) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.nascimento = nascimento;
		this.genero = genero;
		this.webSite = webSite;
		this.telefone = telefone;
		this.uriFoto = uriFoto;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getNascimento() {
		return nascimento;
	}

	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getWebSite() {
		return webSite;
	}

	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}

	public String getUriFoto() {
		return uriFoto;
	}

	public void setUriFoto(String uriFoto) {
		this.uriFoto = uriFoto;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public ArrayList<Foto> getFoto() {
		return foto;
	}

	public void setFoto(ArrayList<Foto> foto) {
		this.foto = foto;
	}

	public ArrayList<Album> getAlbum() {
		return album;
	}

	public void setAlbum(ArrayList<Album> album) {
		this.album = album;
	}

	public ArrayList<Postagem> getPostagem() {
		return postagem;
	}

	public void setPostagem(ArrayList<Postagem> postagem) {
		this.postagem = postagem;
	}

	public ArrayList<Usuario> getSeguidor() {
		return seguidor;
	}

	public void setSeguidor(ArrayList<Usuario> seguidor) {
		this.seguidor = seguidor;
	}

	public ArrayList<Usuario> getSeguindo() {
		return seguindo;
	}

	public void setSeguindo(ArrayList<Usuario> seguindo) {
		this.seguindo = seguindo;
	}

	public void addFoto(Foto foto) {
		this.foto.add(foto);
	}

	public void removePFoto(Foto foto) {
		this.foto.remove(foto);
	}

	public void addPostagem(Postagem postagem) {
		this.postagem.add(postagem);
	}

	public void removePostagem(Postagem postagem) {
		this.postagem.remove(postagem);
	}

	public void addAlbum(Album album) {
		this.album.add(album);
	}

	public void removeAlbum(Album album) {
		this.album.remove(album);
	}

	public void addSeguidor(Usuario seguidor,Usuario seguindo) {
		this.seguidor.add(seguidor);
		this.seguindo.add(seguindo);
	}

	public void removeSeguidor(Usuario seguidor,Usuario seguindo) {
		this.seguidor.remove(seguidor);
		this.seguindo.remove(seguindo);
	}
	
	public void Status() {
		for(int i = 0;i < seguidor.size();i++) {
			System.out.println(""+seguidor.get(i).getNome()+" seguindo "+seguindo.get(i).getNome());
		}
	}

	@Override
	public String toString() {
		return "Usuario id = " + id + ", nome = " + nome + ", email = " + email + ", nascimento = " + nascimento + ", genero="
				+ genero + "\n webSite = " + webSite + ", telefone = " + telefone + ", uriFoto = " + uriFoto +
				"\n album = " + album + "\n postagem = " + postagem+"\n";
	}
	
	
}
