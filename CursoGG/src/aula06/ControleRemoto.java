package aula06;

public class ControleRemoto implements Controlador{
	//Atributos
    private int volume;
    private boolean ligado;
    private Boolean tocando;
    
    //Métodos Especiais
    public ControleRemoto() {
       	this.volume = 50;
       	this.ligado = true;
       	this.tocando = false;
    }

	private int getVolume() {
		return volume;
	}

	private void setVolume(int volume) {
		this.volume = volume;
	}

	private boolean getLigado() {
		return ligado;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	private boolean getTocando() {
		return tocando;
	}

	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
    
	//Métodos abstratos

	@Override
	public void ligar() {
		this.setLigado(true);
	}

	@Override
	public void desligar() {
		this.setLigado(false);
	}

	@Override
	public void abrirMenu() {
	  System.out.println("______MENU______");
	  System.out.println("Esta ligado? "+this.getLigado());
	  System.out.println("Está tocando? "+this.getTocando());
	  System.out.println("Volume: "+this.getVolume());
	  for(int i=0;i <= this.getVolume();i+=10) {
		  System.out.print("|");
	  }
	  System.out.println("");
	}

	@Override
	public void fevhaMenu() {
		System.out.println("Fechando menu...");
	}

	@Override
	public void maisVolume() {
		if(this.getLigado() == true) {
			this.setVolume(this.getVolume() + 5);
		}else {
			System.out.println("impossivel aumentar volume");
		}
	}

	@Override
	public void menosVolume() {
		if(this.getLigado()) {
			this.setVolume(this.getVolume() - 5);
		}else {
			System.out.println("Impoaaivel diminuir volume");
		}
	}

	@Override
	public void ligarMudo() {
		if(this.getLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		}
	}

	@Override
	public void deligarMudo() {
		if(this.getLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		}
	}

	@Override
	public void play() {
		if(this.getLigado() && !(this.getTocando())) { // ! significa não
               this.setTocando(true);
		}
		else {
			System.out.println("Não consegui reproduzir");
		}
	}

	@Override
	public void pause() {
		if(this.getLigado() && this.getTocando()) {
			this.setTocando(false);
		}else {
			System.out.println("Não consegui pausar");
		}
	}
	
}
