package com.DemoProject.DemoProject_THymeleaf.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DemoProject.DemoProject_THymeleaf.Model.Employee;
import com.DemoProject.DemoProject_THymeleaf.Repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	public EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getallEmployees() {
		return employeeRepository.findAll();

	}

	@Override
	public void saveEmployee(Employee employee) {
		this.employeeRepository.save(employee);
	}

	@Override
	public Employee getEmployeeById(String name) {
		Optional<Employee> optional = employeeRepository.findById(name);
		Employee employee = null;
		if (optional.isPresent()) {
			employee = optional.get();
		} else {
			throw new RuntimeException("Employee not found by id" + name);
		}
		return employee;

	}

	@Override
	public Employee deleteEmployeeById(String name) {
		Employee employee = new Employee();
		this.employeeRepository.deleteById(name);
		return employee;

	}

}
