package com.task.taskmanagement.dtos;

import com.task.taskmanagement.entity.Task;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TaskDto {
    private String description;
    @Enumerated(EnumType.STRING)
    private Task.Status status;

    private LocalDate dueDate;
}
