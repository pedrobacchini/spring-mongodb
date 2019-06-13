package com.github.pedrobacchini.springmongodb.resource;

import com.github.pedrobacchini.springmongodb.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserResource {

    @GetMapping()
    public ResponseEntity<List<User>> findAll() {
        User maria = new User("1", "Maria Brown", "maria@email.com");
        User alex = new User("2", "Alex Green", "alex@email.com");

        ArrayList<User> users = new ArrayList<>(Arrays.asList(maria, alex));
        return ResponseEntity.ok(users);
    }
}
