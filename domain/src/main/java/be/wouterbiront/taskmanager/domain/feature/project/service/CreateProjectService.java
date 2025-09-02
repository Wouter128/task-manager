package be.wouterbiront.taskmanager.domain.feature.project.service;

import be.wouterbiront.taskmanager.domain.feature.project.model.Project;
import be.wouterbiront.taskmanager.domain.feature.project.port.in.CreateProjectCommand;
import be.wouterbiront.taskmanager.domain.feature.project.port.out.ProjectRepositoryPort;
import org.springframework.stereotype.Service;

@Service
public class CreateProjectService implements CreateProjectCommand {

    private final ProjectRepositoryPort projectRepository;

    public CreateProjectService(ProjectRepositoryPort projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public void execute(Project project) {
        projectRepository.create(project);
    }
}
