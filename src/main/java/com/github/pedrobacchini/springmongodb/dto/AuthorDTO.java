package com.github.pedrobacchini.springmongodb.dto;

import com.github.pedrobacchini.springmongodb.domain.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class AuthorDTO implements Serializable {

    private static final long serialVersionUID = 5975326432972934980L;

    private String id;
    private String name;

    public AuthorDTO(User user) {
        this.id = user.getId();
        this.name = user.getName();
    }
}
