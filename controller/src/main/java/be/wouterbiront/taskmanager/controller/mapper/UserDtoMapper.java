package be.wouterbiront.taskmanager.controller.mapper;

import be.wouterbiront.taskmanager.controller.dto.UserDto;
import be.wouterbiront.taskmanager.domain.feature.user.model.User;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface UserDtoMapper {
    UserDto toDto(User user);
    User toUser(UserDto userDto);

    List<UserDto> toDto(List<User> users);
}
