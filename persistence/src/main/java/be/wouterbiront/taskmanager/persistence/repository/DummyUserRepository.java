package be.wouterbiront.taskmanager.persistence.repository;

import be.wouterbiront.taskmanager.persistence.entity.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class DummyUserRepository {
    private List<UserEntity> userList;

    private int id = 0;

    public DummyUserRepository() {
        init();
    }

    private void init() {
        userList = new ArrayList<>();
        UserEntity user1 = UserEntity.builder()
                .id("1")
                .firstName("Wouter")
                .lastName("Biront")
                .build();

        UserEntity user2 = UserEntity.builder()
                .id("2")
                .firstName("John")
                .lastName("Doe")
                .build();

        userList.add(user1);
        userList.add(user2);

        id = 2;
    }

    public void saveUser(UserEntity user) {
        id++;
        user.setId(String.valueOf(id));
        userList.add(user);
    }

    public List<UserEntity> getAllUsers() {
        return userList;
    }

    public Optional<UserEntity> getUserById(String id) {
        return userList.stream().filter(user -> user.getId().equals(id)).findFirst();
    }
}
