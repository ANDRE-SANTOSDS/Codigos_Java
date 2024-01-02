package aula13;

public class Principal {

	public static void main(String[] args) {
		/*Polimorfismo -> permite que um mesmo nome represente vários comportamentos diferentes.
		 *Polimorfismo de sobrecarga -> Assinaturas diferentes na mesma classe
		 * Poli = muitas
		 * Morfo = formas
		 * */

		Cachorro c = new Cachorro();
		c.reagir(2,12.5);
		c.reagir(17,4.5);
	}

}
