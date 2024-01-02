package aula07a;

public class Lutador implements Lutadorm {
//Atibutos
	private String nome;
	private String nacionalidade;
	private Integer idade;
	private Double altura;
	private Double peso;
	private String categoria;
	private Integer vitorias, derrotas, empates;

//Métodos Públicos
	@Override
	public void apresentar() {
		// TODO Auto-generated method stub
		System.out.println("_______________________________________________________");
        System.out.println("Chegou a hora! Apresentamos o lutador "+ this.getNome());
        System.out.println("Diretamente de "+ this.nacionalidade);
        System.out.println("com "+this.getIdade()+" anos e "+this.altura);
        System.out.println("pesando "+this.getPeso()+" Kg");
        System.out.println(this.getVitorias()+" Vitorias");
        System.out.println(this.getDerrotas()+" Derrotas");
        System.out.println(this.getEmpates()+" Empates");
	}

	@Override
	public void ganharLuta() {
		// TODO Auto-generated method stub
        this.setVitorias(getVitorias() + 1);
	}

	@Override
	public void perderLuta() {
		// TODO Auto-generated method stub
        this.derrotas = this.derrotas + 1;
	}

	@Override
	public void empatarLuta() {
		// TODO Auto-generated method stub
       this.setEmpates(getEmpates() + 1);
	}
	@Override
	public void staatus() {
		// TODO Auto-generated method stub
        System.out.println(this.getNome() +" é um peso "+this.getCategoria());
        System.out.println("Ganhou "+this.getVitorias()+ " vezes");
        System.out.println("Pedeu "+this.getDerrotas()+ " vezes");
        System.out.println("Empatou "+this.getEmpates()+ " vezes");
	}
//Métodos Especiais

	public Lutador(String nome, String nacionalidade, Integer idade, Double altura, Double peso,
			Integer vitorias, Integer derrotas, Integer empates) {
		super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso);
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
		this.setCategoria();
	}

	public String getCategoria() {
		return categoria;
	}

	private void setCategoria() {
		if(this.getPeso()< 52.2) {
			this.categoria = "Inválido";
		}else if(this.getPeso()>52.2 && this.getPeso() <= 70.3) {
			this.categoria = "Leve";
		}else if(this.getPeso() > 70.3 && this.getPeso() <= 83.9) {
			this.categoria = "Médio";
		}else if(this.getPeso() > 83.9 && this.getPeso() < 120.2) {
			this.categoria = "Pesado";
		}else {
			this.categoria = "Inválido";
		}
	}

	public Integer getVitorias() {
		return vitorias;
	}

	public void setVitorias(Integer vitorias) {
		this.vitorias = vitorias;
	}

	public Integer getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(Integer derrotas) {
		this.derrotas = derrotas;
	}

	public Integer getEmpates() {
		return empates;
	}

	public void setEmpates(Integer empates) {
		this.empates = empates;
	}
	
}
