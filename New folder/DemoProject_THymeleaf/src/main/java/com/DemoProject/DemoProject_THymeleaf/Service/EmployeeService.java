package com.DemoProject.DemoProject_THymeleaf.Service;

import java.util.List;

import com.DemoProject.DemoProject_THymeleaf.Model.Employee;

public interface EmployeeService {
	
 public List<Employee> getallEmployees();
 
 void saveEmployee(Employee employee);

 Employee getEmployeeById( String name);
 
 Employee deleteEmployeeById( String name);

}
