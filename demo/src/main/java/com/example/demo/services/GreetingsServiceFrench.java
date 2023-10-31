package com.example.demo.services;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("salutation")
//@Primary
public class GreetingsServiceFrench implements GreetingService {

    @Override
    public String sayHello() {
        return "Bonjour tout le monde ";
    }
}
