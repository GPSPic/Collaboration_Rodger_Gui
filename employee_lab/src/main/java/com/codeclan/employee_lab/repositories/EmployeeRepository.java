package com.codeclan.employee_lab.repositories;

import com.codeclan.employee_lab.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
