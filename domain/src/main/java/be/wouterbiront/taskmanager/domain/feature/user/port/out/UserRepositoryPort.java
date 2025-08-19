package be.wouterbiront.taskmanager.domain.feature.user.port.out;

import be.wouterbiront.taskmanager.domain.feature.user.model.User;

public interface UserRepositoryPort {
    User save(User user);
    User findById(String id);
}
