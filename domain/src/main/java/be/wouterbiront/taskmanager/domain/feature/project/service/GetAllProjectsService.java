package be.wouterbiront.taskmanager.domain.feature.project.service;

import be.wouterbiront.taskmanager.domain.feature.project.model.Project;
import be.wouterbiront.taskmanager.domain.feature.project.port.in.GetAllProjectsQuery;
import be.wouterbiront.taskmanager.domain.feature.project.port.out.ProjectRepositoryPort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetAllProjectsService implements GetAllProjectsQuery {

    private final ProjectRepositoryPort projectRepository;

    public GetAllProjectsService(ProjectRepositoryPort projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public List<Project> read() {
        return projectRepository.findAll();
    }
}
