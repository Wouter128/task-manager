package be.wouterbiront.taskmanager.persistence.mapper;

import be.wouterbiront.taskmanager.domain.feature.project.model.Project;
import be.wouterbiront.taskmanager.persistence.entity.ProjectEntity;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface ProjectMapper {
    Project toProject(ProjectEntity projectEntity);
    List<Project> toProject(List<ProjectEntity> projectEntityList);

    ProjectEntity toProjectEntity(Project project);
}
