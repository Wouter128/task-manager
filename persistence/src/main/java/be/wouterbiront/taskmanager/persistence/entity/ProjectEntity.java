package be.wouterbiront.taskmanager.persistence.entity;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name = "projects")
public class ProjectEntity {

    @Id
    private UUID id = UUID.randomUUID();

    private String name;
    private String description;

    @OneToMany(mappedBy = "project")
    private List<TaskEntity> tasks = new ArrayList<>();
}
