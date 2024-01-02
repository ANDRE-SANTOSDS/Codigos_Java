package aula11;

public class Aluno extends Pessoa {
	private Integer matricula;
	private String curso;

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public void pagaMensalidade() {
		System.out.println("Pagando mensalidade do aluno " + getNome());
	}

	@Override
	public String toString() {
		return ""+super.toString()+", Aluno [matricula=" + matricula + ", curso=" + curso + "]";
	}
	
	
}
