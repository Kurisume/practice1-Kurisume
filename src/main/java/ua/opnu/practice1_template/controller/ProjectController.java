package com.example.project.controller;

import com.example.project.model.Project;
import com.example.project.service.ProjectService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projects")
public class ProjectController {

    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @PostMapping
    public Project create(@RequestBody Project project) {
        return projectService.create(project);
    }

    @GetMapping
    public List<Project> getAll() {
        return projectService.getAll();
    }

    @PutMapping("/{id}")
    public Project update(@PathVariable Long id, @RequestBody Project project) {
        project.setId(id);
        return projectService.update(project);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        projectService.delete(id);
    }
}
