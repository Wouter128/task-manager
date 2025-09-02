package be.wouterbiront.taskmanager.persistence.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserEntity {
    private String id;
    private String firstName;
    private String lastName;
}
