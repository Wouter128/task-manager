package be.wouterbiront.taskmanager.controller.mapper;

import be.wouterbiront.taskmanager.controller.dto.ProjectDto;
import be.wouterbiront.taskmanager.domain.feature.project.model.Project;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface ProjectDtoMapper {
    ProjectDto toDto(Project project);
    Project toProject(ProjectDto projectDto);

    List<ProjectDto> toDto(List<Project> projects);
}
