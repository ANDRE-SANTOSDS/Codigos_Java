package conta;

public class Conta {
	private int number;
	private String holder;
	private double balance;

	public Conta(int number, String holder, double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public int getNumber() {
		return number;
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

	public void deposit(double amount) {
        balance += amount;
	}

	public void withdraw(double amount) {
		if(amount + 5.0 <= balance) {
          balance = balance - amount - 5.0;
          return;
		}else {
			System.out.println("Your balance is very low.");
		}
		
	}

	@Override
	public String toString() {
		return "Account " + number + ", Holder: " + holder + ", Balance: " + String.format("%.2f", balance);
	}
	
}