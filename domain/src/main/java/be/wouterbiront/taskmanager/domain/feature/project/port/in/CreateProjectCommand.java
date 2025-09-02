package be.wouterbiront.taskmanager.domain.feature.project.port.in;

import be.wouterbiront.taskmanager.domain.feature.project.model.Project;

public interface CreateProjectCommand {
    void execute(Project project);
}
