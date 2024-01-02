package aula11;

public class Aula11 {

	public static void main(String[] args) {
		/*Tipos de herança
		 * Herança de implementação
		 * Herança para difereça
		 * */
		/*Classes abstratas
		 * Não pode ser instanciada. Só pode servir como progenitora. ex: public abstract class Pessoa{}
		 * 
		 * Método abstrato
		 * Declarado, mas não implementado na progenitora.
		 * 
		 * Classe final
		 * Não pode ser herdada por outra classe. ex: public final class Bolsista extends Aluno{}
		 * 
		 * Método final
		 * Não pode ser sobrescrito/sobreposto pelas suas sub-classes. Obrigatoriamente herdado. ex: public void final pagaMensalidade(){}*/
		
		//Pessoa p1 = new Pessoa(). Não pode ser instanciada, pois ela é uma classe abstrata.;

		Visitante v1 = new Visitante();
		v1.setNome("Juvenal");
		v1.setIdade(22);
		v1.setSexo("M");
		System.out.println(v1);
		
		Aluno a1 = new Aluno();
		a1.setNome("Claúdio");
		a1.setMatricula(111);
		a1.setCurso("Informática");
		a1.setIdade(16);
		a1.setSexo("M");
		System.out.println(a1);
		a1.pagaMensalidade();
		
		Bolsista b1 = new Bolsista();
		b1.setMatricula(1112);
		b1.setNome("Jubileu");
		b1.setIdade(17);
		b1.setBolsa(12.5);
		b1.setSexo("M");
		System.out.println(b1);
		b1.pagaMensalidade();
	}

}
