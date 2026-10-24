package com.example.task_api.repository;

import com.example.task_api.modle.Task;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class TaskRepository {
    private final Map<Long, Task> database = new HashMap<>();

    public List<Task> findAll() {
        return new ArrayList<>(database.values());
    }

    public Task findById(Long id) {
        return database.get(id);
    }

    public void save(Task task) {
        database.put(task.getId(), task);
    }

    public boolean delete(Long id) {
        return database.remove(id) != null;
    }
}