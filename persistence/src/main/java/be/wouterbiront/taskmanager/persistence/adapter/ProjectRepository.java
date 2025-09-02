package be.wouterbiront.taskmanager.persistence.adapter;

import be.wouterbiront.taskmanager.domain.feature.project.model.Project;
import be.wouterbiront.taskmanager.domain.feature.project.port.out.ProjectRepositoryPort;
import be.wouterbiront.taskmanager.persistence.entity.ProjectEntity;
import be.wouterbiront.taskmanager.persistence.mapper.ProjectMapper;
import be.wouterbiront.taskmanager.persistence.repository.DummyProjectRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
public class ProjectRepository implements ProjectRepositoryPort {

    private final DummyProjectRepository projectRepository;
    private final ProjectMapper mapper;

    @Override
    public void create(Project project) {
        projectRepository.saveProject(mapper.toProjectEntity(project));
    }

    @Override
    public Project findById(String id) {
        Optional<ProjectEntity> projectOpt = projectRepository.getProjectById(id);

        return projectOpt.map(mapper::toProject).orElse(null);
    }

    @Override
    public List<Project> findAll() {
        return mapper.toProject(projectRepository.getAllProjects());
    }
}
