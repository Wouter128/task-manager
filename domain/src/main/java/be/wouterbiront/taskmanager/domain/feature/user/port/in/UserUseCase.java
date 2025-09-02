package be.wouterbiront.taskmanager.domain.feature.user.port.in;

import be.wouterbiront.taskmanager.domain.feature.user.model.User;

import java.util.List;

public interface UserUseCase {
    void createUser(User user);

    User getUserById(String id);

    List<User> getUsers();
}
