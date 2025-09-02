package be.wouterbiront.taskmanager.controller.controller;

import be.wouterbiront.taskmanager.controller.dto.ProjectDto;
import be.wouterbiront.taskmanager.controller.mapper.ProjectDtoMapper;
import be.wouterbiront.taskmanager.domain.feature.project.port.in.CreateProjectCommand;
import be.wouterbiront.taskmanager.domain.feature.project.port.in.GetAllProjectsQuery;
import be.wouterbiront.taskmanager.domain.feature.project.port.in.GetProjectByIdQuery;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
@RequestMapping("/projects")
@AllArgsConstructor
public class ProjectController {

    private final CreateProjectCommand createProjectCommand;
    private final GetProjectByIdQuery getProjectByIdQuery;
    private final GetAllProjectsQuery getAllProjectsQuery;
    private final ProjectDtoMapper mapper;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE, path = "/create")
    public ResponseEntity<Void> createProject(@RequestBody ProjectDto projectDto) {
        createProjectCommand.execute(mapper.toProject(projectDto));
        return ResponseEntity.ok().build();
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ProjectDto>> getAllProjects() {
        return ResponseEntity.ok().body(mapper.toDto(getAllProjectsQuery.read()));
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE, path ="/{id}")
    public ResponseEntity<ProjectDto> getProjectById(@PathVariable String id) {
        return ResponseEntity.ok().body(mapper.toDto(getProjectByIdQuery.read(id)));
    }
}
