package com.taskmanagement.repository;

import com.taskmanagement.entity.Task;
import com.taskmanagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByAuthor(User author);

    List<Task> findByExecutor(User executor);
}
/*findByAuthor: Fetches tasks created by a specific author.
findByExecutor: Fetches tasks assigned to a specific executor.*/