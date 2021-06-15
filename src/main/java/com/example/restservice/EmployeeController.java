package com.example.restservice;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    private final EmployeeRepository repository;

    EmployeeController(EmployeeRepository repository) {
        this.repository = repository;
    }

    @PutMapping("/employee")
    public Employee add(@RequestBody Employee newEmployee) {
        return repository.save(newEmployee);
    }

    @GetMapping("/employee/{id}")
    public Employee one(@PathVariable String id) throws JsonProcessingException {
        return repository.findById(id);
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
