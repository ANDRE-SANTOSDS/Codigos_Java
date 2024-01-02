package questao9;

public class MaisVelho {
     private String nome;
     private Integer idade;
     
     public MaisVelho(String nome,Integer idade) {
    	 this.nome = nome;
    	 this.idade = idade;
     }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
}
