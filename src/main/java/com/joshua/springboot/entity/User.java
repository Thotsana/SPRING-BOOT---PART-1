package com.joshua.springboot.entity;

public class User {

    // instance variables
    private final long id;
    private String name;
    private String surname;

    // all fields constructor
    public User(long id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
