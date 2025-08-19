package be.wouterbiront.taskmanager.persistence.entity;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name = "tasks")
public class TaskEntity {

    @Id
    private UUID id = UUID.randomUUID();

    private String name;
    private String description;

    @Enumerated(EnumType.STRING)
    private TaskStatus status;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private ProjectEntity project;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity assignedUser;
}