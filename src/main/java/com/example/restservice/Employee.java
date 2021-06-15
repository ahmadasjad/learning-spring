package com.example.restservice;

//import javax.persistence.Entity;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
    private @Id @GeneratedValue String id;
    private String name;
    private String email;

    Employee() {}

    Employee(String name) {

        this.name = name;
    }

    @JsonCreator
    Employee(@JsonProperty("name") String name, @JsonProperty("email") String email) {
        this.name = name;
        this.email = email;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "{\"id\": \"" + this.id + "\", \"name\": \"" + this.name + "\", \"email\": \"" + this.email + "\"}";
    }

}
