package com.example.restservice;

public class NotFoundException  extends RuntimeException {
    NotFoundException(String id) {
        super("Could not find employee " + id);
    }
}
