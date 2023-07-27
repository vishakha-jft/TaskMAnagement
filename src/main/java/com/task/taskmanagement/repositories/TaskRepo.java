package com.task.taskmanagement.repositories;

import com.task.taskmanagement.entity.Task;
import com.task.taskmanagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepo extends JpaRepository<Task, Integer> {
    List<Task> findAll();

    List<Task> findByUserId(User userId);

    Task findById(int taskId);

    void deleteById(int taskId);
}
