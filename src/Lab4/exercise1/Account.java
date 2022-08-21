package Lab4.exercise1;

import java.util.Random;

public class Account {
	
	private long accNum;
	private double balance ;
	private Person accHolder ;
	
	public Account() {
	}
	
	public Account(double balance, Person p) {
		this.accHolder = p ;
		this.balance  = balance ;
		this.AccNum();
	}
	
	void AccNum() {
		//generate random number
		Random n = new Random();
		int num = n.nextInt(999999);
		accNum = Integer.parseInt(String.format("%6d", num)) ;
	}
	
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}


	public void deposit(double d) {
		this.balance += d ;
	}
	

	public void withdraw(double w) {
		this.balance  -= w ;
	}

	public double getBalance() {
		return balance ;
	}
	
	public long getAccNum() {
		return accNum;
	}
	
	public void getAccHolder() {
		System.out.println(accHolder.toString());
	}
	
	

	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", balance=" + balance + " INR , accHolder=" + accHolder+ "]";
	}

	
	
}
