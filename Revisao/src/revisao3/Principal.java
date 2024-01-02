package revisao3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;

public class Principal {

	public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       
       Foto foto1 = new Foto("http://domminio.com/praia2.jpg",LocalDateTime.now());
       Foto foto2 = new Foto("http://domminio.com/praia3.jpg",LocalDateTime.now());
       
       Postagem postagem1 = new Postagem(1,"#partiu festa!",LocalDateTime.now());
       Postagem postagem2 = new Postagem(2,"Bom dia povo!",LocalDateTime.now());
       
       Album album1 = new Album(1,"Festa de verão",LocalDateTime.now());
       album1.addFoto(foto1);
       album1.addFoto(foto2);
       
       Usuario usuario1 = new Usuario(1,"João Silva","joao@gmail.com",LocalDate.parse("1991-10-15"),null,"M",null,"http://domminio.com/joao43.jpg");
       Usuario usuario2 = new Usuario(2,"Maria Alice","alice@gmail.com",LocalDate.parse("1999-04-15"),"youtube.com/alice","F",null,"http://domminio.com/festa.jpg");
       Usuario usuario3 = new Usuario(3,"Carlos Alves","carlos@yahoo.com",null,null,"M","99777-8383","http://domminio.com/carlito.jpg");
       usuario3.addAlbum(album1);
       Usuario usuario4 = new Usuario(4,"Ana Clara","aninha@gmail.com",LocalDate.parse("1997-01-23"),"blog.clara.com","F","88181-2820","http://domminio.com/clara.jpg");
       usuario4.addPostagem(postagem1);
       usuario4.addPostagem(postagem2);
       
       System.out.println(usuario1);
       System.out.println(usuario2);
       System.out.println(usuario3);
       System.out.println(usuario4);
       
       usuario1.addSeguidor(usuario3, usuario1);
       usuario1.addSeguidor(usuario4, usuario1);
       usuario2.addSeguidor(usuario4, usuario2);
       usuario3.addSeguidor(usuario4, usuario3);
       usuario1.Status();
       usuario2.Status();
       usuario3.Status();
	}

}
