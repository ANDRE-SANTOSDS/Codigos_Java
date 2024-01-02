package questao3;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Student stu = new Student();
        
        stu.nome = sc.nextLine();
       
        stu.nota1 = sc.nextDouble();
        
        stu.nota2 = sc.nextDouble();
        
        stu.nota3 = sc.nextDouble();
        System.out.print(stu);
        
        if(stu.somaNotas() > 60) {
        	System.out.println("PASS");
        }else if(stu.somaNotas() < 60) {
        	System.out.println("FAILED");
        	stu.soma -= 60;
        	System.out.printf("FALTAM = %.2f PONTOS\n",stu.soma*-1);
        }
		
		sc.close();
	}

}
