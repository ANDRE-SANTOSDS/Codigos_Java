package aula04;

/* Métodos acessores
 * 
 * GETTERS(pegar ou acessar alguam informação/atributo de forma mais segura) */

/* Métodos modificadores
 * 
 * SETTERS(modificam coisas que estão dentro do objeto,garantindo 
 * uma total segurança para o atributo)
 * SETTERS precisa receber parâmetros*/

/* Método construtor 
 * CONSTRUCT ele pode receber parâmetros*/

public class Caneta {
    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;
    
    //Método construtor ele tem o mesmo nome da classe 
    public Caneta(String modelo,String cor, float ponta) {
    	this.modelo = modelo;
    	this.cor = cor;
    	this.setPonta(ponta);
    	this.tampar();
    }
    
    public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getPonta() {
		return ponta;
	}
	public void setPonta(float ponta) {
		this.ponta = ponta;
	}
	public void tampar() {
		this.tampada = true;
	}
	public void destampar() {
		this.tampada = false;
	}
	public void status() {
		System.out.println("SOBRE A CANETA:");
		System.out.println("Modelo: "+this.getModelo());
		System.out.println("Ponta: "+this.getPonta());
		System.out.println("Cor: "+this.cor);
		System.out.println("Tampada: "+this.tampada);
	}
}
