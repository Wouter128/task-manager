package be.wouterbiront.taskmanager.persistence.entity;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    private UUID id = UUID.randomUUID();

    private String firstName;
    private String lastName;

    @OneToMany(mappedBy = "assignedUser")
    private List<TaskEntity> tasks = new ArrayList<>();
}
