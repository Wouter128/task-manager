package be.wouterbiront.taskmanager.persistence.adapter;

import be.wouterbiront.taskmanager.domain.feature.user.model.User;
import be.wouterbiront.taskmanager.domain.feature.user.port.out.UserRepositoryPort;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository implements UserRepositoryPort {
    @Override
    public User save(User user) {
        // Dummy data
        return user;
    }

    @Override
    public User findById(String id) {
        return null;
    }
}
