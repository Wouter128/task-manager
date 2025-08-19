package be.wouterbiront.taskmanager.domain.feature.project.model;

import be.wouterbiront.taskmanager.domain.feature.task.model.Task;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Project {
    private String id;
    private String name;
    private String description;
    private List<Task> taskList;
}
