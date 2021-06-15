package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @PutMapping("/employee")
    public String add() {
        return "Add one employee :<pre>" + this.toString() + "</pre>";
    }

    @GetMapping("/employee/{id}")
    public String one() {
        return "Get one employee :<pre>" + this.toString() + "</pre>";
    }

    @PutMapping("/employee/{id}")
    public String update() {
        return "Update one employee :<pre>" + this.toString() + "</pre>";
    }

    @GetMapping("/employees")
    public String all() {
        return "Get all employee :<pre>" + this.toString() + "</pre>";
    }
}
