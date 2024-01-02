package q1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;

public class Principal {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Postagem postagem = new Postagem(1,"#partiu festa",LocalDateTime.now());
		Foto foto = new Foto("http://dominio.com/praia2.jpg",LocalDateTime.now(),null);
		Album album = new Album(1,"Festa de verão",LocalDateTime.now());
		Usuario usuario1 = new Usuario(1,"João Silva","joao@gmail.com",LocalDate.now(),"M",null, "http://dominio.com/joao43.jpg","555555555");
		usuario1.addPostagem(postagem);
		usuario1.addFoto(foto);
		usuario1.addAlbum(album);
		
		
		Postagem postagem2 = new Postagem(2,"#partiu festa",LocalDateTime.now());
		Foto foto2 = new Foto("http://dominio.com/praia3.jpg",LocalDateTime.now(),null);
		Album album2 = new Album(2,"Festa de outono",LocalDateTime.now());
		Usuario usuario2 = new Usuario(2,"Maria Alici","alice@gmail.com",LocalDate.now(),"youtube.com/alice","F", "http://dominio.com/alice.jpg","99999999");
		usuario2.addPostagem(postagem2);
		usuario2.addFoto(foto2);
		usuario2.addAlbum(album2);
		
		Postagem postagem3 = new Postagem(3,"#partiu casa",LocalDateTime.now());
		Foto foto3 = new Foto("http://dominio.com/praia3.jpg",LocalDateTime.now(),null);
		Album album3 = new Album(3,"Festa de outono",LocalDateTime.now());
		Usuario usuario3 = new Usuario(3,"Carlos","carlito@gmail.com",LocalDate.now(),"youtube.com/carlos","M", "http://dominio.com/carlos.jpg","999988888");
		usuario2.addPostagem(postagem3);
		usuario2.addFoto(foto3);
		usuario2.addAlbum(album3);
		
		Postagem postagem4 = new Postagem(4,"#partiu rua",LocalDateTime.now());
		Foto foto4 = new Foto("http://dominio.com/praia4.jpg",LocalDateTime.now(),null);
		Album album4 = new Album(4,"Festa de outono",LocalDateTime.now());
		Usuario usuario4 = new Usuario(4,"Ana clara","clara@gmail.com",LocalDate.now(),"blog.clara.com","F", "http://dominio.com/ana.jpg","777779999");
		usuario3.addPostagem(postagem4);
		usuario3.addFoto(foto4);
		usuario3.addAlbum(album4);
		
		System.out.println(usuario1);
		System.out.println("\n"+usuario2);
		System.out.println("\n"+usuario3);
		System.out.println("\n"+usuario4);
	}
}
