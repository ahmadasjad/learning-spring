package com.example.restservice;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.web.bind.annotation.*;

import com.example.restservice.repository.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    private final StudentRepository repository;

//    StudentController(StudentRepository repository) {
//        this.repository = repository;
//    }

//    protected StudentController() {
//
//    }

    public StudentController(StudentRepository repository) {
        this.repository = repository;
    }



    @PostMapping("/students")
    public Student add(@RequestBody Student  newStudent) {
        return repository.save(newStudent);
    }

    @GetMapping("/students/{id}")
    public Optional<Student> one(@PathVariable Long id) {
        return repository.findById(id);
    }

    @GetMapping("/students")
    public List<Student> all() {
        return (List<Student>) repository.findAll();
    }

    @GetMapping("/students/{id}/books")
    public List<Book> studentBooks(@PathVariable Long id) {
        Logger logger = LoggerFactory.getLogger(StudentController.class);
        logger.info("Hello World");
        Optional<Student> student = repository.findById(id);
        return student.get().getBooks();
    }
}
