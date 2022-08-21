package Lab4.exercise1;

public class Main {
	public static void main(String[] args) {
		
		Person p1 = new Person("Smith", 30) ;
		Person p2 = new Person("Kathy", 30) ;
		
		Account a1 = new Account(2000, p1) ;
		a1.deposit(2000);
		System.out.println(a1);
		
		Account a2 = new Account(3000, p2) ;
		a2.withdraw(2000);
		System.out.println(a2);
		
		SavingAccount sa1 = new SavingAccount(3000, p1) ;
		System.out.println(sa1);
	}
}
