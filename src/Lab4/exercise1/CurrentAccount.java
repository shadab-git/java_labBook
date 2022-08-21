package Lab4.exercise1;

public class CurrentAccount extends Account{
	final private int overdraftLimit = 3 ;
	
	public CurrentAccount(double amt, Person p) {
		super(amt, p) ;
	}
	
	@SuppressWarnings("unused")
	@Override
	public void withdraw(double w) {
		
		if(overdraftLimit> 3) {
			return;
		}
		else {
			super.withdraw(w);
		}
	}
}
