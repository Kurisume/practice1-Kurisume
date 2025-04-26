package com.example.project.controller;

import com.example.project.model.Team;
import com.example.project.service.TeamService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teams")
public class TeamController {

    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @PostMapping
    public Team create(@RequestBody Team team) {
        return teamService.create(team);
    }

    @GetMapping
    public List<Team> getAll() {
        return teamService.getAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        teamService.delete(id);
    }
}
