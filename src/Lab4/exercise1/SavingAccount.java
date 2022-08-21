package Lab4.exercise1;

public class SavingAccount extends Account {
	final private long minimumBalance = 2000 ;
	
	SavingAccount(double amt, Person p){
		super(amt, p) ;
	}
	
	
	@Override
	public void withdraw(double w) {
		double balance = getBalance() ;
		
		if(balance> minimumBalance) {
			super.withdraw(w) ;
		}
		else {
			System.out.println("can't withdraw your balance is lower than minimum balance");
			return ;
		}
	}
}
