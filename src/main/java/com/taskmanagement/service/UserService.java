package com.taskmanagement.service;

import com.taskmanagement.entity.User;
import java.util.Optional;

//Handle all user-related logic, such as finding users and creating new ones.
public interface UserService {
    User createUser(User user);

    Optional<User> findByEmail(String email);

    User findById(Long id);
}
