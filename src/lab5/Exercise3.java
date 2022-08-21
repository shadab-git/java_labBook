package lab5;

import lab5.com.cg.eis.exception.EmployeeException;

public class Exercise3 {
	public void validateSalary(double salary) throws EmployeeException{
		if(salary<3000) {
			throw new EmployeeException("Salary low for this scheme") ;
		}
	}
	public static void main(String[] args) {
		Exercise3 e3 = new Exercise3() ;
		
		try {
			e3.validateSalary(500);
		} catch (EmployeeException e) {
			e.printStackTrace();
		}
	}
}
