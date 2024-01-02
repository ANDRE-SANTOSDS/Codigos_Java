package listas;

import java.util.ArrayList;

public class Lista3 {

	public static void main(String[] args) {
		/*
		 * Tipos Primitivos -> Wrapper class
		 * int              -> Integer
		 * float            -> Float
		 * double           -> Double
		 * String           -> String
		 * Char             -> Character
		 * boolean          -> Boolean
		 *
		 */
		/*ArrayList<String> nome = new ArrayList<String>();
		ArrayList<Integer> numero = new ArrayList<Integer>();
		ArrayList<Double> real = new ArrayList<Double>();
		ArrayList<Boolean> tf = new ArrayList<Boolean>();
		ArrayList<Character> charr = new ArrayList<Character>();
		ArrayList<Float> reall = new ArrayList<Float>();*/

		Pessoa joao = new Pessoa("Joao",20);
		Pessoa maria = new Pessoa("Maria",22);
		Pessoa pedro = new Pessoa("Pedro",33);
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(joao);
		pessoas.add(maria);
		pessoas.add(pedro);
		
		for(Pessoa p: pessoas) {
			System.out.println(""+p.getNome()+" tem "+p.getIdade()+" anos");
		}
	}

}
