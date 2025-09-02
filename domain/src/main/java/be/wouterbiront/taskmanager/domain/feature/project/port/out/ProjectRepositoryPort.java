package be.wouterbiront.taskmanager.domain.feature.project.port.out;

import be.wouterbiront.taskmanager.domain.feature.project.model.Project;

import java.util.List;

public interface ProjectRepositoryPort {
    void create(Project project);

    Project findById(String id);

    List<Project> findAll();
}
