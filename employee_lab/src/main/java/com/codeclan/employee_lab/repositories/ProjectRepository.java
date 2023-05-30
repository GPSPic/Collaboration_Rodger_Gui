package com.codeclan.employee_lab.repositories;

import com.codeclan.employee_lab.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
