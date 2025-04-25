package ua.opnu.practice1_template.repository;

import ua.opnu.practice1_template.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
