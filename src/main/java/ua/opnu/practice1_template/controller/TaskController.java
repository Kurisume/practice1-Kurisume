package com.example.project.controller;

import com.example.project.model.Task;
import com.example.project.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    public Task create(@RequestBody Task task) {
        return taskService.create(task);
    }

    @GetMapping("/project/{projectId}")
    public List<Task> getByProject(@PathVariable Long projectId) {
        return taskService.getTasksByProject(projectId);
    }

    @GetMapping("/employee/{employeeId}")
    public List<Task> getByEmployee(@PathVariable Long employeeId) {
        return taskService.getTasksByEmployee(employeeId);
    }

    @GetMapping("/status/{status}")
    public List<Task> getByStatus(@PathVariable String status) {
        return taskService.getTasksByStatus(status);
    }

    @PutMapping("/{id}")
    public Task update(@PathVariable Long id, @RequestBody Task task) {
        task.setId(id); // Теперь ошибка исчезнет
        return taskService.update(task);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        taskService.delete(id);
    }
}
