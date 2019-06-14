package com.github.pedrobacchini.springmongodb.config;

import com.github.pedrobacchini.springmongodb.domain.Post;
import com.github.pedrobacchini.springmongodb.domain.User;
import com.github.pedrobacchini.springmongodb.repository.PostRepository;
import com.github.pedrobacchini.springmongodb.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

@Configuration
public class Instantiation implements CommandLineRunner {

    private final UserRepository userRepository;
    private final PostRepository postRepository;

    public Instantiation(UserRepository userRepository,
                         PostRepository postRepository) {
        this.userRepository = userRepository;
        this.postRepository = postRepository;
    }

    @Override
    public void run(String... args) throws ParseException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));

        userRepository.deleteAll();
        postRepository.deleteAll();

        User maria = new User(null, "Maria", "maria@gmail.com");
        User alex = new User(null, "Alex", "alex@gmail.com");
        User bob = new User(null, "Bob", "bob@gmail.com");

        userRepository.saveAll(Arrays.asList(maria, alex, bob));

        Post post1 = new Post(null, simpleDateFormat.parse("21/03/2018"), "Partiu viajem", "Vou viajer para São Paulo, Abraços!", maria);
        Post post2 = new Post(null, simpleDateFormat.parse("22/03/2018"), "Bom dia", "Acordei feliz hoje!", maria);

        postRepository.saveAll(Arrays.asList(post1, post2));
    }
}
