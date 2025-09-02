package be.wouterbiront.taskmanager.domain.feature.user.service;

import be.wouterbiront.taskmanager.domain.feature.user.model.User;
import be.wouterbiront.taskmanager.domain.feature.user.port.in.CreateUserCommand;
import be.wouterbiront.taskmanager.domain.feature.user.port.out.UserRepositoryPort;
import org.springframework.stereotype.Service;

@Service
public class CreateUserService implements CreateUserCommand {

    private final UserRepositoryPort userRepository;

    public CreateUserService(UserRepositoryPort userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void execute(User user) {
        // TODO: further implementation

        userRepository.save(user);
    }
}
