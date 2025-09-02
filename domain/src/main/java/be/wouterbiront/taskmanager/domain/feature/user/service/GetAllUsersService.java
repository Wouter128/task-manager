package be.wouterbiront.taskmanager.domain.feature.user.service;

import be.wouterbiront.taskmanager.domain.feature.user.model.User;
import be.wouterbiront.taskmanager.domain.feature.user.port.in.GetAllUsersQuery;
import be.wouterbiront.taskmanager.domain.feature.user.port.out.UserRepositoryPort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetAllUsersService implements GetAllUsersQuery {

    private final UserRepositoryPort userRepository;

    public GetAllUsersService(UserRepositoryPort userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> read() {
        return userRepository.findAll();
    }
}
