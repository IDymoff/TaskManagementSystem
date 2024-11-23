package com.taskmanagement.repository;

import com.taskmanagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}

/*JpaRepository<User, Long>: Provides CRUD operations for the User entity, where Long is the type of the primary key.
findByEmail: A custom query method to fetch a user by email (useful for authentication).*/