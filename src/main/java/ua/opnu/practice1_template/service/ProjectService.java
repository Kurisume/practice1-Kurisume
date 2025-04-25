package ua.opnu.practice1_template.service;

import ua.opnu.practice1_template.model.Project;
import ua.opnu.practice1_template.repository.ProjectRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    private final ProjectRepository repo;

    public ProjectService(ProjectRepository repo) {
        this.repo = repo;
    }

    public Project create(Project project) {
        return repo.save(project);
    }

    public List<Project> getAll() {
        return repo.findAll();
    }
}
