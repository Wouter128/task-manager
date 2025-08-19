package be.wouterbiront.taskmanager.domain.feature.task.model;

import be.wouterbiront.taskmanager.domain.common.enums.TaskStatus;
import be.wouterbiront.taskmanager.domain.feature.user.model.User;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Task {
    private int id;
    private String name;
    private User user;
    private TaskStatus status;
}
