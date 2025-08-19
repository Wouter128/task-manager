package be.wouterbiront.taskmanager.domain.feature.user.port.in;

import be.wouterbiront.taskmanager.domain.feature.user.model.User;

public interface GetUserByIdQuery {
    User read(String id);
}
