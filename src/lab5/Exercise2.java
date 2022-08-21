package lab5;
/*
 * Exercise 2: Write a Java Program to validate the full name of an employee.
 *  Create and throw a user defined exception if firstName and lastName is blank.
 */
public class Exercise2 {
	
	
 	public void validateName(String fname, String mname, String lname) throws Exception {
		if(fname == "" && lname=="" ) {
			throw new Exception("Enter full Name") ;
		}else {
			System.out.println(fname + mname + lname);
		}
	}
 	public static void main(String[] args) {
		
 		Exercise2 e2 = new Exercise2() ;
 		
 		try {
			e2.validateName("Ahmad", "Shadab", "");
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
	}
}
