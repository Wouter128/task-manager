package be.wouterbiront.taskmanager.controller.controller;

import be.wouterbiront.taskmanager.controller.dto.UserDto;
import be.wouterbiront.taskmanager.controller.mapper.UserDtoMapper;
import be.wouterbiront.taskmanager.domain.feature.user.port.in.CreateUserCommand;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {

    private final CreateUserCommand createUserCommand;
    private final UserDtoMapper mapper;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE, path = "/create")
    public ResponseEntity<Void> createNewUser(@RequestBody UserDto userDto) {
        createUserCommand.execute(mapper.toUser(userDto));
        return ResponseEntity.ok().build();
    }
}
