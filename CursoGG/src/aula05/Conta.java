package aula05;
//Exemplo prático
public class Conta {
	public int numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;

	public Conta( ) {
        this.saldo = 0;
        this.status = false;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void abrirConta(String tipo) {
       setTipo(tipo);
       setStatus(true);
       if(tipo == "CC") {
    	   setSaldo(50);
       }else if(tipo == "CP") {
    	   this.saldo = 150;
       }
       System.out.println("Conta aberta com sucesso");
	}

	public void fecharConta() {
      if(this.saldo > 0) {
    	  System.out.println("Conta não pode ser fechada porque ainda tem dinheiro");
      }else if(this.saldo < 0) {
    	  System.out.println("Conta não pode ser fechada pois tem débito");
      }else {
    	 this.setStatus(false);
    	 System.out.println("Conta fechada com sucesso");
      }
	}

	public void depositar(float v) {
        if(this.getStatus()) {
        	setSaldo(getSaldo() + v);
        	System.out.println("Deposito realizado com sucesso na conta de "+getDono());
        }else {
        	System.out.println("Impossivel depositar");
        }
	}

	public void sacar(float v) {
         if(this.status == true) {
        	 if(this.getSaldo() > v) {
        		 this.saldo -= v;
        		 System.out.println("Saque realizado na conta de "+this.dono);
        	 }else {
        		 System.out.println("Saldo insuficiente");
        	 }
         }else {
        	 System.out.println("Impossivel sacar");
         }
	}

	public void pagarMensal() {
      int v = 0;
      if(this.tipo == "CC") {
    	  v = 12;
      }else if(this.tipo == "CP") {
    	  v = 20;
      }
      if(this.status == true) {
    	this.setSaldo(getSaldo() - v);
    	System.out.println("Mensalidade paga com sucesso por "+getDono());
      }else {
    	  System.out.println("Impossivel pagar");
      }
	} 
	public void estadoAtual() {
		
		System.out.println("Conta: "+ this.getNumConta());
		System.out.println("Tipo: "+ this.getTipo());
		System.out.println("Dono: "+ this.getDono());
		System.out.println("Saldo: "+ this.getSaldo());
		System.out.println("Status: "+ this.getStatus());
		System.out.println("_____________________________________");
	}
}
