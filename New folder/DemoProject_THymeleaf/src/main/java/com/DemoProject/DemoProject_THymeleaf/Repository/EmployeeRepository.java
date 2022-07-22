package com.DemoProject.DemoProject_THymeleaf.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.DemoProject.DemoProject_THymeleaf.Model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String>{

}
