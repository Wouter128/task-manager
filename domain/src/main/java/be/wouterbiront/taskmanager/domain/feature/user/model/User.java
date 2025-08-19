package be.wouterbiront.taskmanager.domain.feature.user.model;

import be.wouterbiront.taskmanager.domain.feature.task.model.Task;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class User {
    private String id;
    private String firstName;
    private String lastName;
    private List<Task> taskList;
}
