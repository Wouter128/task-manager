package be.wouterbiront.taskmanager.controller.controller;

import be.wouterbiront.taskmanager.controller.dto.UserDto;
import be.wouterbiront.taskmanager.controller.mapper.UserDtoMapper;
import be.wouterbiront.taskmanager.domain.feature.user.port.in.CreateUserCommand;
import be.wouterbiront.taskmanager.domain.feature.user.port.in.GetAllUsersQuery;
import be.wouterbiront.taskmanager.domain.feature.user.port.in.GetUserByIdQuery;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {

    private final CreateUserCommand createUserCommand;
    private final GetUserByIdQuery getUserByIdQuery;
    private final GetAllUsersQuery getAllUsersQuery;
    private final UserDtoMapper mapper;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE, path = "/create")
    public ResponseEntity<Void> createNewUser(@RequestBody UserDto userDto) {
        createUserCommand.execute(mapper.toUser(userDto));
        return ResponseEntity.ok().build();
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<UserDto>> getAllUsers() {
        return ResponseEntity.ok().body(mapper.toDto(getAllUsersQuery.read()));
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE, path = "/{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable String id) {
        return ResponseEntity.ok().body(mapper.toDto(getUserByIdQuery.read(id)));
    }
}
