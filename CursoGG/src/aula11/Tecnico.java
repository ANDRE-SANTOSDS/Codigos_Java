package aula11;

public final class Tecnico extends Aluno {
	private String regisroProficiional;

	public void praticar() {

	}

	public String getRegisroProficiional() {
		return regisroProficiional;
	}

	public void setRegisroProficiional(String regisroProficiional) {
		this.regisroProficiional = regisroProficiional;
	}

	@Override
	public String toString() {
		return ""+super.toString()+" Tecnico [regisroProficiional=" + regisroProficiional + "]";
	}

}
