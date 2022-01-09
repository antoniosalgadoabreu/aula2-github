package entities;

public class Conta {
	
	private int acc_number;
	private String acc_holder;
	private double balance;
	
	public Conta(int acc_number, String acc_holder, double initialDeposit) {
		this.acc_number = acc_number;
		this.acc_holder = acc_holder;
		deposit(initialDeposit);
	}
	public Conta(int acc_number, String acc_holder) {
		this.acc_number = acc_number;
		this.acc_holder = acc_holder;
	}
	public int getAcc_number() {
		return acc_number;
	}
	public String getAcc_holder() {
		return acc_holder;
	}
	public void setAcc_holder(String acc_holder) {
		this.acc_holder = acc_holder;
	}
	public double getBalance() {
		return balance;
	}
	public void deposit(double value) {
		this.balance += value;
	}
	public void withdraw(double value) {
		this.balance -= (value + 5);
	}
	public String toString() {
		return "Account: "
				+acc_number
				+", Holder: "
				+acc_holder
				+", Balance: $ "
				+String.format("%.2f", balance);
	}

}
