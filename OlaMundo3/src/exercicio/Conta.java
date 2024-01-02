package exercicio;

public class Conta implements ContaB{
    private Integer number;
    private String holder;
    private double balance;
    
    public Conta(Integer number,String holder,double balance) {
    	super();
    	this.number = number;
    	this.holder = holder;
    	this.balance = balance;
    }

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	@Override
	public void deposit(double amount) {
		setBalance(getBalance() + amount);
	}

	@Override
	public void withdraw(double amount) {
		setBalance(getBalance() - amount - 5.00);
	}
	
    
}
