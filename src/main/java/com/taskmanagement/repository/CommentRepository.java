package com.taskmanagement.repository;

import com.taskmanagement.entity.Comment;
import com.taskmanagement.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByTask(Task task);
}
//findByTask: Retrieves all comments for a specific task