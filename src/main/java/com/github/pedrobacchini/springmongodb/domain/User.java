package com.github.pedrobacchini.springmongodb.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
@Document
public class User implements Serializable {

    private static final long serialVersionUID = -3744442800797599218L;

    @Id
    private String id;
    private String name;
    private String email;
}
