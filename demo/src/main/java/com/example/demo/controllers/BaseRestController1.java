package com.example.demo.controllers;


import com.example.demo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseRestController1 {

    private final GreetingService greetingService;


    @Autowired
    public BaseRestController1(@Qualifier("salutation") GreetingService greetingService){
        this.greetingService = greetingService;

    }

@RequestMapping(value = "/hello-service")
    public String sayHello(){
    System.out.println(greetingService.sayHello());
    return "Coucou";
    }
}
