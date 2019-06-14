package com.github.pedrobacchini.springmongodb.service;

import com.github.pedrobacchini.springmongodb.domain.User;
import com.github.pedrobacchini.springmongodb.dto.UserDTO;
import com.github.pedrobacchini.springmongodb.repository.UserRepository;
import com.github.pedrobacchini.springmongodb.service.exception.ObjectNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) { this.userRepository = userRepository; }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(String id) {
        Optional<User> userOptional = userRepository.findById(id);
        return userOptional.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public User insert(User user) {
        return userRepository.insert(user);
    }

    public User fromDTO(UserDTO userDTO) {
        return new User(userDTO.getId(), userDTO.getName(), userDTO.getEmail());
    }
}
