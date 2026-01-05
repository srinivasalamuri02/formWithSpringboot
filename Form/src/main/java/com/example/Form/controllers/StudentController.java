package com.example.Form.controllers;

import com.example.Form.model.Student;
import com.example.Form.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/registor")
    public Student registor(@RequestParam String name,
                            @RequestParam String email,
                            @RequestParam Integer age){
        return studentRepository.save(new Student(name,email,age));
    }
}
