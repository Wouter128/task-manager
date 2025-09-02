package be.wouterbiront.taskmanager.persistence.adapter;

import be.wouterbiront.taskmanager.domain.feature.user.model.User;
import be.wouterbiront.taskmanager.domain.feature.user.port.out.UserRepositoryPort;
import be.wouterbiront.taskmanager.persistence.entity.UserEntity;
import be.wouterbiront.taskmanager.persistence.mapper.UserMapper;
import be.wouterbiront.taskmanager.persistence.repository.DummyUserRepository;
import lombok.AllArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@AllArgsConstructor
public class UserRepository implements UserRepositoryPort {

    private final DummyUserRepository userRepository;
    private final UserMapper mapper;

    @Override
    public void save(User user) {
        userRepository.saveUser(mapper.toUserEntity(user));
        System.out.println("Saved user with firstname: " + user.getFirstName() + " and lastname: " + user.getLastName());
    }

    @Override
    public User findById(String id) {
        Optional<UserEntity> userOpt = userRepository.getUserById(id);

        if (userOpt.isPresent()) {
            UserEntity userEntity = userOpt.get();

            return mapper.toUser(userEntity);
        }

        return null;
    }
}
