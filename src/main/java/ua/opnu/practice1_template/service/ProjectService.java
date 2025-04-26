package com.example.project.service;

import com.example.project.model.Project;
import com.example.project.repository.ProjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    private final ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public Project create(Project project) {
        return projectRepository.save(project);
    }

    public List<Project> getAll() {
        return projectRepository.findAll();
    }

    public Project update(Project project) {
        return projectRepository.save(project);
    }

    public void delete(Long id) {
        projectRepository.deleteById(id);
    }
}
