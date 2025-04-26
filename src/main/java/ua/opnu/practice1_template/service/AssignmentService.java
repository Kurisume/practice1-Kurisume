package com.example.project.service;

import com.example.project.model.Assignment;
import com.example.project.repository.AssignmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssignmentService {

    private final AssignmentRepository assignmentRepository;

    public AssignmentService(AssignmentRepository assignmentRepository) {
        this.assignmentRepository = assignmentRepository;
    }

    public Assignment create(Assignment assignment) {
        return assignmentRepository.save(assignment);
    }

    public List<Assignment> getAssignmentsByEmployee(Long employeeId) {
        return assignmentRepository.findByEmployeeId(employeeId);
    }

    public List<Assignment> getAssignmentsByProject(Long projectId) {
        return assignmentRepository.findByProjectId(projectId);
    }
}
