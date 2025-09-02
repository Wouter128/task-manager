package be.wouterbiront.taskmanager.persistence.repository;

import be.wouterbiront.taskmanager.persistence.entity.ProjectEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class DummyProjectRepository {
    private List<ProjectEntity> projectList;

    private int id = 0;

    public DummyProjectRepository() {
        init();
    }

    private void init() {
        projectList = new ArrayList<>();
    }

    public void saveProject(ProjectEntity projectEntity) {
        id++;
        projectEntity.setId(String.valueOf(id));
        projectList.add(projectEntity);
    }

    public List<ProjectEntity> getAllProjects() {
        return projectList;
    }

    public Optional<ProjectEntity> getProjectById(String id) {
        return projectList.stream().filter(project -> project.getId().equals(id)).findFirst();
    }
}
