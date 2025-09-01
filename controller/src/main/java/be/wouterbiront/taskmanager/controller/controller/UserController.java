package be.wouterbiront.taskmanager.controller.controller;

import be.wouterbiront.taskmanager.controller.dto.UserDto;
import be.wouterbiront.taskmanager.domain.feature.user.model.User;
import be.wouterbiront.taskmanager.domain.feature.user.port.in.CreateUserCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
@RequestMapping("/users")
public class UserController {

    private final CreateUserCommand createUserCommand;

    @Autowired
    public UserController(CreateUserCommand createUserCommand) {
        this.createUserCommand = createUserCommand;
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE, path = "/create")
    public ResponseEntity<User> createNewUser(@RequestBody UserDto userDto) {
        // TODO: map userDto to user
        User user = new User(userDto.firstName, userDto.lastName);
        return ResponseEntity.ok().body(createUserCommand.execute(user));
    }
}
