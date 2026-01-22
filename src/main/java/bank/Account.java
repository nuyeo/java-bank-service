package bank;

public class Account {
	
	protected String owner;
	protected int balance;

	public Account(String owner) {
		this.owner = owner;
	}
	
	public Account(String owner, int balance) {
		this.owner = owner;
		if (balance > 0) {
			this.balance = balance;
		}
	}
	
	void deposit(int amount) {
		//TODO: 입금
	    if (amount <= 0) {
	        System.out.println("1원 이상 입금 가능합니다.");
	        return;
	    }
	    
	    this.balance += amount;
	}
	
	void withdraw(int amount) {
		//TODO: 출금
	    if (amount <= 0) {
	        System.out.println("1원 이상 출금 가능합니다.");
	        return;
	    }
	    
	    if (this.balance < amount) {
	        System.out.println("잔액이 부족합니다.");
	        return;
	    }
	    
	    this.balance -= amount;
	}
	
	
}
