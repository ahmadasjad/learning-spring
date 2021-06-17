package com.example.restservice;

//import com.fasterxml.jackson.annotation.JsonCreator;
//import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {
    private @Id
    @GeneratedValue
    Long id;
    private String name;
    private String email;

    protected Student() {}

    Student(String name) {
        this.name = name;
    }

    Student(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    public String toString() {
//        return "{\"id\": \"" + this.id + "\", \"name\": \"" + this.name + "\", \"email\": \"" + this.email + "\"}";
//    }
}
