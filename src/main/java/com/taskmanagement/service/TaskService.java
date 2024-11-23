package com.taskmanagement.service;

import com.taskmanagement.entity.Task;
import com.taskmanagement.entity.User;
import java.util.List;

//Manage tasks, including creating, updating, and assigning them.

public interface TaskService {
    Task createTask(Task task);

    Task updateTask(Long taskId, Task task);

    void deleteTask(Long taskId);

    List<Task> getTasksByAuthor(User author);

    List<Task> getTasksByExecutor(User executor);
}
