package be.wouterbiront.taskmanager.domain.feature.user.service;

import be.wouterbiront.taskmanager.domain.feature.user.model.User;
import be.wouterbiront.taskmanager.domain.feature.user.port.in.CreateUserCommand;
import be.wouterbiront.taskmanager.domain.feature.user.port.out.UserRepositoryPort;

public class CreateUserService implements CreateUserCommand {

    private UserRepositoryPort userRepository;

    @Override
    public User execute(User user) {
        // TODO: further implementation

        return userRepository.save(user);
    }
}
