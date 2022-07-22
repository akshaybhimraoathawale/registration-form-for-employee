package com.DemoProject.DemoProject_THymeleaf.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.DemoProject.DemoProject_THymeleaf.Model.Employee;
import com.DemoProject.DemoProject_THymeleaf.Service.EmployeeService;

@Controller
public class EmpController {

	@Autowired
	public EmployeeService employeeService;

	@GetMapping("/")
	public String showPage(Model model) {

		model.addAttribute("listEmployees", employeeService.getallEmployees());
		return "index";
	}

	@GetMapping("/showNewEmployeeForm")
	public String showNewEmployee(Model model) {
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "new_employee";
	}

	@PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute("employee") Employee employee) {

		employeeService.saveEmployee(employee);
		return "redirect:/";
	}

	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable(value = "id") String name, Model model) {
		Employee employee = employeeService.getEmployeeById(name);
		model.addAttribute("employee", employee);
		return "update_employee";

	}
	

	

	@GetMapping("/DeleteEmployee/{id}")
	public String deleteEmployee(@PathVariable(value = "id") String name) {
		this.employeeService.deleteEmployeeById(name);
		return "redirect:/";
	}
}
