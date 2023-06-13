package curs09;

public class Account {
	
	int balance = 0;
	
	public void deposit(int amount) {
		if(amount <= 0) {
		//	throw new InvalidAmountException(amount + " is not a valid amount");
		}
		balance = balance + amount;
		}	
}
