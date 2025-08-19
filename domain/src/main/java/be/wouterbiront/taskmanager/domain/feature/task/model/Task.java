package be.wouterbiront.taskmanager.domain.feature.task.model;

import be.wouterbiront.taskmanager.domain.common.enums.TaskStatus;
import be.wouterbiront.taskmanager.domain.feature.user.model.User;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Task {
    private String id;
    private String name;
    private String description;
    private User assignedUser;
    private TaskStatus status;
}
