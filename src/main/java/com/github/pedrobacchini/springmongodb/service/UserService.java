package com.github.pedrobacchini.springmongodb.service;

import com.github.pedrobacchini.springmongodb.domain.User;
import com.github.pedrobacchini.springmongodb.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) { this.userRepository = userRepository; }

    public List<User> findAll() {
        return userRepository.findAll();
    }
}
