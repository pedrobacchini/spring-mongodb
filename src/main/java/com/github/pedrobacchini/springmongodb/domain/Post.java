package com.github.pedrobacchini.springmongodb.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
@Document
public class Post implements Serializable {

    private static final long serialVersionUID = -9214230971016783409L;

    @Id
    private String id;
    private Date date;
    private String title;
    private String body;
    private User author;
}
