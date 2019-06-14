package com.github.pedrobacchini.springmongodb.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
@Document
public class User implements Serializable {

    private static final long serialVersionUID = -3744442800797599218L;

    @Id
    private String id = "dsa";
    private String name;
    private String email;
    @DBRef(db = "post", lazy = true)
    private final List<Post> posts = new ArrayList<>();
}
