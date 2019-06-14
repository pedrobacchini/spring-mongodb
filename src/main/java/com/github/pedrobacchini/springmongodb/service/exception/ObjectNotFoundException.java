package com.github.pedrobacchini.springmongodb.service.exception;

public class ObjectNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 7706806828047048059L;

    public ObjectNotFoundException(String message) {
        super(message);
    }
}
