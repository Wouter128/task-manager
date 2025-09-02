package be.wouterbiront.taskmanager.domain.feature.user.service;

import be.wouterbiront.taskmanager.domain.feature.user.model.User;
import be.wouterbiront.taskmanager.domain.feature.user.port.in.UserUseCase;
import be.wouterbiront.taskmanager.domain.feature.user.port.out.UserRepositoryPort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserUseCase {

    private final UserRepositoryPort userRepository;

    public UserService(UserRepositoryPort userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void createUser(User user) {
        // TODO: further implementation

        userRepository.save(user);
    }

    @Override
    public User getUserById(String id) {
        return userRepository.findById(id);
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }
}
