package listas;

import java.util.ArrayList;

public class Listas1 {

	public static void main(String[] args) {
		ArrayList<String> arrayDinamico = new ArrayList<String>();
		arrayDinamico.add("Goku");// indice 0
		arrayDinamico.add("Maria");// indice 1
		arrayDinamico.add("Pedro");// indice 2
		arrayDinamico.add("Vegeta");// indice 3
		arrayDinamico.add("Bob");// indice 4
		// arrayDinamico.add("Nome qualquer");//indice 5
		for (int i = 0; i < arrayDinamico.size(); i++) {
            System.out.println(arrayDinamico.get(i));
		}
		System.out.println("////////////////////////////////////");
		System.out.println("Remover Pedro");
		System.out.println();
		arrayDinamico.remove(2);//remove -> remove um elemento por indice
		
		for (int i = 0; i < arrayDinamico.size(); i++) {
            System.out.println(arrayDinamico.get(i));
		}
		
		arrayDinamico.clear();//Clear -> limpa todo o arrayList
		for (int i = 0; i < arrayDinamico.size(); i++) {
            System.out.println(arrayDinamico.get(i));
		}
		
	}

}
