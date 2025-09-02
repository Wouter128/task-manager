package be.wouterbiront.taskmanager.persistence.adapter;

import be.wouterbiront.taskmanager.domain.feature.user.model.User;
import be.wouterbiront.taskmanager.domain.feature.user.port.out.UserRepositoryPort;
import be.wouterbiront.taskmanager.persistence.entity.UserEntity;
import be.wouterbiront.taskmanager.persistence.repository.DummyUserRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UserRepository implements UserRepositoryPort {

    private final DummyUserRepository userRepository;

    public UserRepository(DummyUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void save(User user) {
        UserEntity userEntity = UserEntity.builder()
                .id(user.getId())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .build();

        userRepository.saveUser(userEntity);
        System.out.println("Saved user with firstname: " + user.getFirstName() + " and lastname: " + user.getLastName());
    }

    @Override
    public User findById(String id) {
        Optional<UserEntity> userOpt = userRepository.getUserById(id);

        if (userOpt.isPresent()) {
            UserEntity userEntity = userOpt.get();

            // Todo: create mapper
            return new User(userEntity.getId(), userEntity.getFirstName(), userEntity.getLastName());
        }

        return null;
    }
}
