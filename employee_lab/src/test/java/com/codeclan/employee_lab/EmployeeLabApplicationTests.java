package com.codeclan.employee_lab;

import com.codeclan.employee_lab.models.Department;
import com.codeclan.employee_lab.models.Employee;
import com.codeclan.employee_lab.models.Project;
import com.codeclan.employee_lab.repositories.DepartmentRepository;
import com.codeclan.employee_lab.repositories.EmployeeRepository;
import com.codeclan.employee_lab.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeLabApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canSaveDepartmentAndEmployeeAndProject() {
		Department accountim = new Department("Accountim");
		departmentRepository.save(accountim);
		Project jimothy = new Project("jimothy", 666);
		projectRepository.save(jimothy);
		Employee tim = new Employee("Tim", 2, accountim);
		employeeRepository.save(tim);
		accountim.addEmployee(tim);
		jimothy.addEmployee(tim);
		tim.addProject(jimothy);
		projectRepository.save(jimothy);
	}

}
