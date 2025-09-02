package be.wouterbiront.taskmanager.domain.feature.user.port.out;

import be.wouterbiront.taskmanager.domain.feature.user.model.User;

import java.util.List;

public interface UserRepositoryPort {
    void save(User user);

    User findById(String id);

    List<User> findAll();
}
