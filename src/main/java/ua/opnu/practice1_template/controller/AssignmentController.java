package com.example.project.controller;

import com.example.project.model.Assignment;
import com.example.project.service.AssignmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/assignments")
public class AssignmentController {

    private final AssignmentService assignmentService;

    public AssignmentController(AssignmentService assignmentService) {
        this.assignmentService = assignmentService;
    }

    @PostMapping
    public Assignment create(@RequestBody Assignment assignment) {
        return assignmentService.create(assignment);
    }

    @GetMapping("/employee/{employeeId}")
    public List<Assignment> getByEmployee(@PathVariable Long employeeId) {
        return assignmentService.getAssignmentsByEmployee(employeeId);
    }

    @GetMapping("/project/{projectId}")
    public List<Assignment> getByProject(@PathVariable Long projectId) {
        return assignmentService.getAssignmentsByProject(projectId);
    }
}
