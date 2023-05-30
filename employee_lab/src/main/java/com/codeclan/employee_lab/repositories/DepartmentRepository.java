package com.codeclan.employee_lab.repositories;

import com.codeclan.employee_lab.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
