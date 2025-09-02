package be.wouterbiront.taskmanager.domain.feature.project.port.in;

import be.wouterbiront.taskmanager.domain.feature.project.model.Project;

import java.util.List;

public interface GetAllProjectsQuery {
    List<Project> read();
}
