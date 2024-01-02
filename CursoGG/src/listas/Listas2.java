package listas;

import java.util.ArrayList;
import java.util.Collections;

public class Listas2 {

	public static void main(String[] args) {
		ArrayList<String> arrayDinamico = new ArrayList<String>();
		arrayDinamico.add("Goku");// indice 0
		arrayDinamico.add("Maria");// indice 1
		arrayDinamico.add("Pedro");// indice 2
		arrayDinamico.add("Vegeta");// indice 3
		arrayDinamico.add("Bob");// indice 4

		Collections.sort(arrayDinamico);

		for (String nome : arrayDinamico) {
			System.out.println(nome);
		}
		
		System.out.println("////////////////////////////");
		ArrayList<String> arrayDinamic = new ArrayList<String>();
		arrayDinamic.add("Goku");// indice 0
		arrayDinamic.add("Maria");// indice 1
		arrayDinamic.add("Pedro");// indice 2
		arrayDinamic.add("Vegeta");// indice 3
		arrayDinamic.add("Bob");// indice 4

		Collections.sort(arrayDinamic, Collections.reverseOrder());

		for (String nome : arrayDinamic) {
			System.out.println(nome);
		}

		System.out.println("/////////////////////////////");
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(100);
		numeros.add(10);
		numeros.add(88);
		numeros.add(0);
		numeros.add(-10);
		numeros.add(23);
		numeros.add(-2);
		numeros.add(33);

		Collections.sort(numeros);// Para imprimir em ordem crescente
		for (Integer nm : numeros) {
			System.out.println(nm);
		}

		System.out.println("/////////////////////////////");
		ArrayList<Integer> numero = new ArrayList<Integer>();
		numero.add(100);
		numero.add(10);
		numero.add(88);
		numero.add(0);
		numero.add(-10);
		numero.add(23);
		numero.add(-2);
		numero.add(33);

		Collections.sort(numero, Collections.reverseOrder());// Para imprimir em ordem decrescente
		for (Integer nmo : numero) {
			System.out.println(nmo);
		}
	}

}
