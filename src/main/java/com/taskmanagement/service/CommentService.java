package com.taskmanagement.service;

import com.taskmanagement.entity.Comment;
import com.taskmanagement.entity.Task;

import java.util.List;

public interface CommentService {
    Comment addComment(Comment comment);

    List<Comment> getCommentsByTask(Task task);
}
