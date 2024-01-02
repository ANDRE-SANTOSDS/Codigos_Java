package Provaq1;

import java.util.ArrayList;

public class BancaAvaliadora {
	private int id;
	private String area;
	private ArrayList<Professor> professores = new ArrayList<>();
	private static int cont = 0;

	public BancaAvaliadora() {
		id = ++cont;
	}

	public BancaAvaliadora(String area) {
		id = ++cont;
		this.area = area;
	}

	public int getId() {
		return id;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public ArrayList<Professor> getProfessores() {
		return professores;
	}

	public void addProfessor(Professor p) {
		professores.add(p);
	}
	
	public void removeProfessor(Professor p) {
		professores.remove(p);
	}

}
