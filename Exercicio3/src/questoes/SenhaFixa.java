package questoes;

import java.util.Locale;
import java.util.Scanner;

public class SenhaFixa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int senha1 = 0;
		System.out.print("Digite a senha: ");
		
		while(senha1 != 2002) {
			senha1 = sc.nextInt();
			if (senha1 != 2002) {
				System.out.print("Senha invalida! Tente novamente: ");
			}else{
				System.out.println("Acesso permitido!");
			}
			
		}

		sc.close();

	}

}
