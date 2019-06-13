package com.github.pedrobacchini.springmongodb.config;

import com.github.pedrobacchini.springmongodb.domain.User;
import com.github.pedrobacchini.springmongodb.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class Instantiation implements CommandLineRunner {

    private final UserRepository userRepository;

    public Instantiation(UserRepository userRepository) { this.userRepository = userRepository; }

    @Override
    public void run(String... args) {

        userRepository.deleteAll();

        User maria = new User(null, "Maria", "maria@gmail.com");
        User alex = new User(null, "Alex", "alex@gmail.com");
        User bob = new User(null, "Bob", "bob@gmail.com");

        userRepository.saveAll(Arrays.asList(maria, alex, bob));
    }
}
