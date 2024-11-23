package com.taskmanagement.entity;
// Represents the tasks being managed

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
    @Table(name = "tasks")
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public class Task {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;//Unique identifier for the task

        @Column(nullable = false)
        private String title;//Short description of the task

        @Column(columnDefinition = "TEXT")
        private String description;//Detailed information about the task

        @Enumerated(EnumType.STRING)
        @Column(nullable = false)
        private Status status;//Current status (e.g., "Pending", "In Progress", "Completed")

        @Enumerated(EnumType.STRING)
        @Column(nullable = false)
        private Priority priority;//Importance level (e.g., "High", "Medium", "Low")

        @ManyToOne
        @JoinColumn(name = "author_id", nullable = false)
        private User author;//The user who created the task

        @ManyToOne
        @JoinColumn(name = "executor_id")
        private User executor;//The user assigned to complete the task

        @OneToMany(mappedBy = "task", cascade = CascadeType.ALL)
        private List<Comment> comments;//List of comments on the task

        public enum Status {
            PENDING,
            IN_PROGRESS,
            COMPLETED
        }

        public enum Priority {
            HIGH,
            MEDIUM,
            LOW
        }
}
