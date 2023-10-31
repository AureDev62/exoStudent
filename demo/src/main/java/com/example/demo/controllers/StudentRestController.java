package com.example.demo.controllers;


import com.example.demo.model.Student;
import com.example.demo.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/student")
public class StudentRestController {

    private final StudentService studentService;

    @Autowired
    public StudentRestController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }


    @GetMapping("/{id}")
    public String getOneStudent(@PathVariable int id){
        return "Vous recherchez l'étudiant avec l'id :" +id;
    }
    @PostMapping
    public Student addStudent(@RequestBody Student student){
        studentService.addStudent(student);
        return student;
    }


}
