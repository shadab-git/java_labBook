package lab5;
/*
 * Exercise 1:  Validate the age of a person and display proper
 *  message by using user defined exception. Age of a person should be above 15.
 */
public class Exercise1 {
	
	public void validate(int age) throws Exception{
		if(age<15) {
			throw new Exception("Age is not valid ") ;
		}
		else {
			System.out.println("Eligible person : ");
		}
	}
	
	public static void main(String[] args) {
		
		Exercise1 e1 = new Exercise1() ;
		
		try {
			e1.validate(2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("...rest of code");
	}
}
