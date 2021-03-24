package javaExample.ch06Ex;

public class Account1 {
	// 6Àå_19¹ø
	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;
	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if (balance < Account1.MIN_BALANCE || balance > Account1.MAX_BALANCE) {
			return;
		}

		this.balance = balance;
	}

}
