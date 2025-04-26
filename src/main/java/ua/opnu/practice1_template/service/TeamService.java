package com.example.project.service;

import com.example.project.model.Team;
import com.example.project.repository.TeamRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {

    private final TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public Team create(Team team) {
        return teamRepository.save(team);
    }

    public List<Team> getAll() {
        return teamRepository.findAll();
    }

    public void delete(Long id) {
        teamRepository.deleteById(id);
    }
}
