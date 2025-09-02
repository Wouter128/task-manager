package be.wouterbiront.taskmanager.domain.feature.user.port.in;

import be.wouterbiront.taskmanager.domain.feature.user.model.User;

import java.util.List;

public interface GetAllUsersQuery {
    List<User> read();
}
