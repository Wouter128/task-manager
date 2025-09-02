package be.wouterbiront.taskmanager.domain.feature.project.service;

import be.wouterbiront.taskmanager.domain.feature.project.model.Project;
import be.wouterbiront.taskmanager.domain.feature.project.port.in.GetProjectByIdQuery;
import be.wouterbiront.taskmanager.domain.feature.project.port.out.ProjectRepositoryPort;
import org.springframework.stereotype.Service;

@Service
public class GetProjectByIdService implements GetProjectByIdQuery {

    private final ProjectRepositoryPort projectRepository;

    public GetProjectByIdService(ProjectRepositoryPort projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public Project read(String id) {
        return projectRepository.findById(id);
    }
}
