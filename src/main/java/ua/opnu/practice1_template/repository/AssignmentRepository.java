package com.example.project.repository;

import com.example.project.model.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AssignmentRepository extends JpaRepository<Assignment, Long> {
    List<Assignment> findByEmployeeId(Long employeeId);
    List<Assignment> findByProjectId(Long projectId);
}
