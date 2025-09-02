package be.wouterbiront.taskmanager.domain.feature.user.service;

import be.wouterbiront.taskmanager.domain.feature.user.model.User;
import be.wouterbiront.taskmanager.domain.feature.user.port.in.GetUserByIdQuery;
import be.wouterbiront.taskmanager.domain.feature.user.port.out.UserRepositoryPort;
import org.springframework.stereotype.Service;

@Service
public class GetUserByIdService implements GetUserByIdQuery {

    private final UserRepositoryPort userRepository;

    public GetUserByIdService(UserRepositoryPort userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User read(String id) {
        return userRepository.findById(id);
    }
}
