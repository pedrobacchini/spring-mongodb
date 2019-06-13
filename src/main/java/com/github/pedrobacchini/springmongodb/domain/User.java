package com.github.pedrobacchini.springmongodb.domain;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
public class User implements Serializable {

    private static final long serialVersionUID = -3744442800797599218L;

    private String id;
    private String name;
    private String email;
}
