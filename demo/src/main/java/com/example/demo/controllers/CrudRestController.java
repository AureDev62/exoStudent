package com.example.demo.controllers;


import com.example.demo.model.Person;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/crud")
public class CrudRestController {


    @GetMapping //http://localahost:8080/api/v1/crud
    public List<String> getAllPerson() {
        return List.of("John Dupont", "Maria Smith", "Toto tata");
    }

    @GetMapping("/{id}") //http://localhost:8080/api/vi/crud/x
    public String getOnePerson(@PathVariable int id) {
        return "Vous cherchez la personne avec l'ID:" + id;

    }

    @PostMapping // POST http://localhost:8080/api/v1/crud
    public Person create(@RequestBody  Person person) {
        return person;
    }

    @DeleteMapping("/{id}") // DELETE http://localhost:8080/api/v1/crud/x
    public String deletePerson(@PathVariable int id) {
        return "Vous cherchez à supprimer une personne avec l'id : " + id;
    }

    @PutMapping("/{id}") // PUT http://localhost:8080/api/v1/crud/x
    public String updatePerson(@PathVariable int id) {
        return "Vous cherchez à modifier une personne avec l'id : " + id;
    }
}
