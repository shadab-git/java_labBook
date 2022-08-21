package Lab7.main.com.cg.eis.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Lab4.exercise2.com.cg.eis.bean.Employee;

public class Service implements EmployeeServiceInterface {

	Map<Integer, Employee> employees = new HashMap<>() ;
	
	@Override
	public Employee addEmployee(Employee emp) {
		employees.put(emp.getId(), emp) ;
		return emp;
	}

	@Override
	public Employee deleteEmployeeById(int empId) {
		Employee emp = employees.get(empId) ;
		employees.remove(empId) ;
		return emp ;
		
	}

	@Override
	public Employee updateEmployee(int empId, Employee emp) {
		Employee newEmp = employees.replace(empId, emp) ;
		return newEmp;
	}

	@Override
	public String findInsuranceScheme(double salary, String designation) {
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
		return insuranceScheme ;
		
	}

	@Override
	public void displayEmployeeDetails() {
		System.out.println(employees);
	}

}
