package com.example.restservice;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Configuration;

import org.apache.commons.io.FilenameUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Configuration
class EmployeeRepository {

    private String path;

    EmployeeRepository() {
        this.path =  "./employees/";
    }

    Employee save(Employee newEmployee) {
        try{
            String id= Long.toString(System.currentTimeMillis());
            newEmployee.setId(id);
            String filePath = this.path + id + ".json";
            File fileObj = new File(filePath);
            fileObj.createNewFile();
            FileWriter fileWriter = new FileWriter(filePath);
            fileWriter.write(newEmployee.toString());
            fileWriter.close();
        } catch (IOException exception) {
            newEmployee.setName(exception.getMessage());
        }
        return newEmployee;
    }

    Employee findById(String id) throws JsonProcessingException {
        String filePath = this.path + id + ".json";
        try {
            String data = this.readFile(filePath);
            Employee employee = new ObjectMapper()
                    .readerFor(Employee.class)
                    .readValue(data);
            return employee;
        } catch (FileNotFoundException e) {
            throw new NotFoundException(id);
        }
    }

    List<Employee> getAll() {
        File folder = new File(this.path);
        String[] files = folder.list();
        List<Employee> employees = new ArrayList<Employee>();

        for (String filename: files) {
            try {
                employees.add(this.findById(FilenameUtils.removeExtension(filename)));
            } catch (JsonProcessingException|NotFoundException exception) {

            }
        }

        return employees;
    }

/*
    boolean deleteById(id) {

    }*/

    String readFile(String filePath) throws FileNotFoundException {
        String data = "";
        File myObj = new File(filePath);
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            data += myReader.nextLine();
        }
        myReader.close();
        return data;
    }
}
