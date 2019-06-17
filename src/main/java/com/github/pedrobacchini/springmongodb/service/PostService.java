package com.github.pedrobacchini.springmongodb.service;

import com.github.pedrobacchini.springmongodb.domain.Post;
import com.github.pedrobacchini.springmongodb.repository.PostRepository;
import com.github.pedrobacchini.springmongodb.service.exception.ObjectNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) { this.postRepository = postRepository; }

    public Post findById(String id) {
        Optional<Post> postOptional = postRepository.findById(id);
        return postOptional.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public List<Post> findByTitle(String text) { return postRepository.findByTitle(text); }

//    public List<Post> findByTitle(String text) { return postRepository.findByTitleContainingIgnoreCase(text); }
}
