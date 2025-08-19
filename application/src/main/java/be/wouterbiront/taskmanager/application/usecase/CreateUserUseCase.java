package be.wouterbiront.taskmanager.application.usecase;

import be.wouterbiront.taskmanager.application.annotation.UseCase;
import be.wouterbiront.taskmanager.domain.feature.user.model.User;
import be.wouterbiront.taskmanager.domain.feature.user.port.in.CreateUserCommand;
import be.wouterbiront.taskmanager.domain.feature.user.service.CreateUserService;

@UseCase
public class CreateUserUseCase implements CreateUserCommand {
    private final CreateUserService createUserService;

    public CreateUserUseCase(CreateUserService createUserService) {
        this.createUserService = createUserService;
    }

    @Override
    public User execute(User user) {
        return createUserService.execute(user);
    }
}
