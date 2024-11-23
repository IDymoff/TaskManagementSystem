package com.taskmanagement.entity;
//Represents the system's users (admin and regular users)

import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Component;

import javax.management.relation.Role;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;//Unique identifier for the user

    @Column(nullable = false)
    private String username;//Name of the user

    @Column(nullable = false)
    private String password;//Encrypted password for login

    @Column(nullable = false, unique = true)
    private String email;//Used for authentication

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;//Determines if the user is an admin or a regular user

    public enum Role {
        ADMIN,
        USER
    }
}
