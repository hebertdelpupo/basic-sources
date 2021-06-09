package Entities;

public class accountBank {

	private int numAccount;
	private String name;
	private double valor;

	public accountBank(int numAccount, String name) {
		super();
		this.numAccount = numAccount;
		this.name = name;
	}

	public accountBank(int numAccount, String name, double initialDeposit) {
		super();
		this.numAccount = numAccount;
		this.name = name;
		deposit(initialDeposit);
	}

	public int getNumAccount() {
		return numAccount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getValor() {
		return valor;
	}

	public double deposit(double amount) {
		return valor = valor + amount;
	}

	public double withdraw(double amount) {
		return valor -= amount + 5.0;
	}
	
	public String toString() {
		return "Account "
				+ numAccount
				+ ", holder"
				+ name
				+ ", Balance: $ "
				+ String.format("%.2f", valor);
	}

}
