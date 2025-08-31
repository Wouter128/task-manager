package be.wouterbiront.taskmanager.domain.feature.project.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Project {
    private String id;
    private String name;
    private String description;
}
