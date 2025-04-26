package com.example.project.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String status;

    @ManyToOne
    private Project project;

    @ManyToOne
    private Employee assignee;

    // Вставила сеттер вручную для id
    public void setId(Long id) {
        this.id = id;
    }
}
