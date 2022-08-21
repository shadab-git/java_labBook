package Lab4.exercise2.com.cg.eis.service;

import java.util.List;

import Lab4.exercise2.com.cg.eis.bean.Employee;

public interface EmployeeServiceInterface {
	public Employee addEmployee(Employee emp) ;
	public Employee deleteEmployeeById(int empId) ;
	Employee updateEmployee(int empId, Employee emp) ;
	public String findInsuranceScheme(double salary, String designation) ;
	public void displayEmployeeDetails() ;
	
	//double updateSalary(int empId, double salary) ;
	//Employee updateName(int Iempd, String newName) ;
}
