package ua.opnu.practice1_template.controller;

import ua.opnu.practice1_template.model.Project;
import ua.opnu.practice1_template.service.ProjectService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projects")
public class ProjectController {
    private final ProjectService service;

    public ProjectController(ProjectService service) {
        this.service = service;
    }

    @PostMapping
    public Project create(@RequestBody Project project) {
        return service.create(project);
    }

    @GetMapping
    public List<Project> getAll() {
        return service.getAll();
    }
}
