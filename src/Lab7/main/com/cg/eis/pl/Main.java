package Lab7.main.com.cg.eis.pl;

import java.util.Scanner;

import Lab4.exercise2.com.cg.eis.bean.Employee;
import Lab4.exercise2.com.cg.eis.service.EmployeeServiceInterface;
import Lab4.exercise2.com.cg.eis.service.Service;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		EmployeeServiceInterface empService = new Service() ;
		
		System.out.println("1. Add Employee");
		System.out.println("2. Update Employee");
		System.out.println("3. Delete Employee");
		System.out.println("4. View Scheme Details");
		System.out.println("5 View employee details");
		System.out.println("5. Enter 0 to exit");
		
		
		int selectedOption ;
		
		do {
			System.out.println("Choose any one option here: ");
			selectedOption = sc.nextInt() ;
			switch(selectedOption) {
			case 1:
				System.out.println("Enter emp Id: ");
				int id =sc.nextInt() ;
				
				System.out.println("Enter emp Name: ");
				String name =sc.next() ;
				
				System.out.println("Enter emp salary: ");
				double salary =sc.nextDouble() ;
				
				System.out.println("Enter emp Designation: ");
				String designation =sc.next() ;
				
				String insuranceScheme = "" ;
				if(salary>5000 && salary<20000 && designation.equalsIgnoreCase("SystemAssociate")) {
					
					insuranceScheme ="Scheme C" ;
				}
				else if(salary>=20000 && salary<40000 && designation.equalsIgnoreCase("Programmer")) {
					insuranceScheme = "Scheme B" ;
				}else if(salary>=40000 && designation.equalsIgnoreCase("Manager")) {
					insuranceScheme = "Scheme A" ;
				}else {
					insuranceScheme = "No Scheme" ;
				}
				Employee emp = new Employee(id,name,salary,designation, insuranceScheme) ;
				Employee newEmp = empService.addEmployee(emp) ;
				System.out.println(newEmp);
				break;
				
			case 2:
				//update
				//get empid, name.args designation salary
				System.out.println("Enter emp Id: ");
				id =sc.nextInt() ;
				
				System.out.println("Enter emp Name: ");
				name =sc.next() ;
				
				System.out.println("Enter emp salary: ");
				salary =sc.nextDouble() ;
				
				System.out.println("Enter emp Designation: ");
				designation =sc.next() ;
				
				if(salary>5000 && salary<20000 && designation.equalsIgnoreCase("SystemAssociate")) {
					
					insuranceScheme ="Scheme C" ;
				}
				else if(salary>=20000 && salary<40000 && designation.equalsIgnoreCase("Programmer")) {
					insuranceScheme = "Scheme B" ;
				}else if(salary>=40000 && designation.equalsIgnoreCase("Manager")) {
					insuranceScheme = "Scheme A" ;
				}else {
					insuranceScheme = "No Scheme" ;
				}
				Employee emp3 = new Employee(id,name,salary,designation, insuranceScheme) ;
				empService.updateEmployee(id, emp3) ;
				System.out.println("Updated successfully");
				
				break;
			case 3 :
				//delete
				System.out.println("Enter emp Id you want to delete: ");
				int empId =sc.nextInt() ;//get emp id from the user
				Employee emp2 = empService.deleteEmployeeById(empId);//call service method delete
				System.out.println(emp2);
				System.out.println("Deleted successfully");//display success/failure info
				break;
				
			case 4:
				//view policy detail
				System.out.println("Enter emp salary: ");
				salary =sc.nextDouble() ;
				System.out.println("Enter emp Designation: ");
				designation =sc.next() ;
				String scheme =empService.findInsuranceScheme(salary, designation);
				System.out.println(scheme);
				break;
				
			case 5:
				empService.displayEmployeeDetails();
				break;
			default:
				System.out.println("choose any option between 1 to 4");
				break ;
			}
		}while(selectedOption !=0) ;
		
		
	}
}
