package com.example.demo.services;

import com.example.demo.model.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudent();

    Student getOneStudent (int id);

    Student addStudent(Student student);

    Student updateStudent(int id, Student student);

    Student deleteStudent(int id);

}
