package com.example.restservice;

//import org.springframework.data.jpa.repository.JpaRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Configuration;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
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
        //Employee employee = new Employee();
        String filePath = this.path + id + ".json";
        String data = this.readFile(filePath);
        //try {
            Employee employee = new ObjectMapper()
                    .readerFor(Employee.class)
                    .readValue(data);
            return employee;
        /*} catch (JsonMappingException jsonMappingException) {
            //
            jsonMappingException.getMessage();
        } catch (JsonProcessingException processingException) {
            //
        }*/
        //return new Employee();
    }

/*
    boolean deleteById(id) {

    }*/

    String readFile(String filePath) {
        String data = "";
        try {
            File myObj = new File(filePath);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                data += myReader.nextLine();
                //System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return data;
    }
}
