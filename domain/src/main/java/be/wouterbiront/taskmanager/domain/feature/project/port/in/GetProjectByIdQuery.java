package be.wouterbiront.taskmanager.domain.feature.project.port.in;

import be.wouterbiront.taskmanager.domain.feature.project.model.Project;

public interface GetProjectByIdQuery {
    Project read(String id);
}
