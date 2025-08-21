package be.wouterbiront.taskmanager.persistence.adapter;

import be.wouterbiront.taskmanager.domain.feature.user.model.User;
import be.wouterbiront.taskmanager.domain.feature.user.port.out.UserRepositoryPort;

public class UserRepository implements UserRepositoryPort {
    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public User findById(String id) {
        return null;
    }
}
