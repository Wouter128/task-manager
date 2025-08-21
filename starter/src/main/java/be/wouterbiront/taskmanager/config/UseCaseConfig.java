package be.wouterbiront.taskmanager.config;

import be.wouterbiront.taskmanager.domain.feature.user.port.in.CreateUserCommand;
import be.wouterbiront.taskmanager.domain.feature.user.port.out.UserRepositoryPort;
import be.wouterbiront.taskmanager.domain.feature.user.service.CreateUserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    @Bean
    public CreateUserCommand createUserCommand(UserRepositoryPort userRepositoryPort) {
        return new CreateUserService(userRepositoryPort);
    }
}
