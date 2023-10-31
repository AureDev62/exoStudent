package com.example.demo.model;


import lombok.Data;

@Data
public class Student {
    private static int count = 0;
    private int id;

    private String lastname;

    private String firstname;

    private int age;

    public Student() {
        this.id = ++count;
    }


}
