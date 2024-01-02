package vetores;

import java.util.Arrays;

public class Vetores {

	public static void main(String[] args) {
		int[] n = new int[4];
		n[0] = 3;
		n[1] = 5;
		n[2] = 8;
		n[3] = 2;
		System.out.println("Vetor[0] ="+n[0]);
		System.out.println("Vetor[1] ="+n[1]);
		System.out.println("Vetor[2] ="+ n[2]);
		System.out.println("Vetor[3] ="+n[3]);
		
		System.out.println("//////////////////////////////////////////////////////////////////////////");
		
		String[] nome= new String[5];

		 nome[0] = "Gustavo";
		 nome[1] = "Andre";
		 nome[2] = "Goku";
		 nome[3] = "Vegeta";
		 nome[4] = "Luan";
		 System.out.println(nome[0]);
		 System.out.println(nome[1]);
		 System.out.println(nome[2]);
		 System.out.println(nome[3]);
		 System.out.println(nome[4]);
		 System.out.println("/////////////////////////////////////////");
		 for(int i = 0;i < 5;i++) {
			 System.out.println(nome[i]);
		 }
		
		System.out.println("//////////////////////////////////////////////////////////////////////////");
		
		int n1[] = {0,1,2,3};
		System.out.println("Vetor[0] ="+n1[0]);
		System.out.println("Vetor[1] ="+n1[1]);
		System.out.println("Vetor[2] ="+n1[2]);
		System.out.println("Vetor[3] ="+n1[3]);
		
		System.out.println("//////////////////////////////////////////////////////////////////////////");
		
		int n2[] = {1,3,5,7,9,10};
		System.out.println("Total de casas de N = "+n2.length);
		for(int i = 0;i < n2.length;i++) {
			System.out.printf("Vetor[%d] = %d\n",i,n2[i]);
		}
		
		System.out.println("//////////////////////////////////////////////////////////////////////////");
		
		String mes[] = {"Jan","Fev","Abr","Mai","Jun","Jul","Ago","Set","Out","Nov","Dez"};
		int dias[] = {31,28,31,20,31,30,31,31,30,31,30,31};
		
		for(int i = 0;i < mes.length;i++) {
			System.out.println("O mes de "+mes[i]+" tem "+dias[i]+" dias");
		}
		
		System.out.println("//////////////////////////////////////////////////////////////////////////");
		
		double v[] = {3.5,2.75,9,-4.5};
		Arrays.sort(v); //Para colocar os valores do vetor em ordem
		for(double valor: v) {
			System.out.println(valor+ " ");
		}
		
		System.out.println("//////////////////////////////////////////////////////////////////////////");
		
		int vet[] = {3,7,6,1,4,9,2};
	    for(int valor: vet) {
	    	System.out.println(valor);
	    }
	    int position = Arrays.binarySearch(vet, 1);/*É usado para pesquisar um determinado valor em um array ordenado. Ele retorna o índice do valor
	    pesquisado se ele estiver presente no array. Caso contrário, retorna um valor negativo.*/
	    System.out.println("Encontrei o valor na posicao "+position);
	    
	    System.out.println("//////////////////////////////////////////////////////////////////////////");
	    
	    int[] v1 = new int[20];
	    Arrays.fill(v1, 0);//Serve para repetir o mesmo valor 
	    for(int valor: v1) {
	    	System.out.print(valor+" ");
	    }
	}

}
