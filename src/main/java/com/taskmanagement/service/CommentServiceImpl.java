package com.taskmanagement.service;

import com.taskmanagement.entity.Comment;
import com.taskmanagement.entity.Task;
import com.taskmanagement.repository.CommentRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    private final CommentRepository commentRepository;

    public CommentServiceImpl(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @Override
    public Comment addComment(Comment comment) {
        return commentRepository.save(comment);
    }

    @Override
    public List<Comment> getCommentsByTask(Task task) {
        return commentRepository.findByTask(task);
    }
}