package com.demo.demo.Domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity // This tells Hibernate to make a table out of this class
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String lastName;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public User(String name, String lastName, String email) {
        this.name = name;
        this.email = email;
        this.lastName = lastName;
    }

    public User() {
    }
}