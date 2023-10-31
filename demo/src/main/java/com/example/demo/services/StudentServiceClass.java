package com.example.demo.services;

import com.example.demo.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentServiceClass implements StudentService{


    private List<Student> students = new ArrayList<>();
    @Override
    public List<Student> getAllStudent () {
        return students;
    }

    @Override
    public Student getOneStudent ( int id){
        return null;
    }

    @Override
    public Student addStudent (Student student){
        students.add(student);
        return student;
    }

    @Override
    public Student updateStudent ( int id, Student student){
        return null;
    }

    @Override
    public Student deleteStudent ( int id){
        return null;
    }
}

