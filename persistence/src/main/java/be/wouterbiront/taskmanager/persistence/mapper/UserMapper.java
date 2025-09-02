package be.wouterbiront.taskmanager.persistence.mapper;

import be.wouterbiront.taskmanager.domain.feature.user.model.User;
import be.wouterbiront.taskmanager.persistence.entity.UserEntity;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface UserMapper {
    User toUser(UserEntity userEntity);
    UserEntity toUserEntity(User user);
}
