package com.github.pedrobacchini.springmongodb.repository;

import com.github.pedrobacchini.springmongodb.domain.Post;
import com.github.pedrobacchini.springmongodb.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
