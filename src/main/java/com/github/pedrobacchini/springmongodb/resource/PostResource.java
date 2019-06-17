package com.github.pedrobacchini.springmongodb.resource;

import com.github.pedrobacchini.springmongodb.domain.Post;
import com.github.pedrobacchini.springmongodb.service.PostService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/posts")
public class PostResource {

    private final PostService postService;

    public PostResource(PostService postService) { this.postService = postService; }

    @GetMapping("/{id}")
    public ResponseEntity<Post> findById(@PathVariable String id) {
        Post post = postService.findById(id);
        return ResponseEntity.ok(post);
    }
}
