package revisao2;

import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Post post1 = new Post(LocalDateTime.now(), "Traveling to New Zealand",
				"I`m going to visit this wonderful country", 12);
		Post post2 = new Post(LocalDateTime.now(), "Good night guys", "See you tommorrow", 5);

		int n;
		System.out.print("Digite quantos comentarios vc vai fazer no post: ");
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.printf("Text %d = ", i + 1);
			String text = sc.nextLine();

			Comment comment = new Comment(text);
			post1.addComment(comment);
		}

		int n2;
		System.out.print("Digite quantos comentarios vc vai fazer no post: ");
		n2 = sc.nextInt();
		for (int i = 0; i < n2; i++) {
			sc.nextLine();
			System.out.printf("Text %d = ", i + 1);
			String text = sc.nextLine();
			
			Comment comment = new Comment(text);
			post2.addComment(comment);
		}
		post1.status();
		post2.status();

		sc.close();
	}
}
