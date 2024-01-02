package aula12;

public class Principal {

	public static void main(String[] args) {
		/*Polimorfismo -> permite que um mesmo nome represente vários comportamentos diferentes.
		 *Polimorfismo de sobreposição -> Acontece quando substituimos um método de uma superclasse na sua subclasse,usando
		 *a mesma assinatura.
		 *Polimorfismo de sobreposição -> Mesma assinatura em diferentes Classes
		 * Poli = muitas
		 * Morfo = formas
		 * */

		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		
		Canguru c = new Canguru();
		Cachorro k = new Cachorro();
		Cobra j = new Cobra();
		Tartaruga t = new Tartaruga();
		GoldFish g = new GoldFish();
		Arara e = new Arara();
		
		c.locomover();
		k.locomover();
		c.emitirSom();
		k.emitirSom();
	}

}
