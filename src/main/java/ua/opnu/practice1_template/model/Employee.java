package com.example.project.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String position;
    private String email;

    // Вставила сеттер вручную для id
    public void setId(Long id) {
        this.id = id;
    }
}
