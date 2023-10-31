package com.example.demo.services;


import org.springframework.stereotype.Service;

@Service("Greeting")

public class GreetingsServiceEnglish implements GreetingService {

    @Override
    public String sayHello() {
        return "Hello Everyone";
    }
}
