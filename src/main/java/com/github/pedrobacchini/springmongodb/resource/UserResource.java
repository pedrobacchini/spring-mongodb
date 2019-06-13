package com.github.pedrobacchini.springmongodb.resource;

import com.github.pedrobacchini.springmongodb.domain.User;
import com.github.pedrobacchini.springmongodb.dto.UserDTO;
import com.github.pedrobacchini.springmongodb.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserResource {

    private final UserService userService;

    public UserResource(UserService userService) { this.userService = userService; }

    @GetMapping
    public ResponseEntity<List<UserDTO>> findAll() {
        List<User> users = userService.findAll();
        List<UserDTO> usersDto = users.stream().map(UserDTO::new).collect(Collectors.toList());
        return ResponseEntity.ok(usersDto);
    }
}
