package com.dojo.personas.controllers;

import com.dojo.personas.model.Persona;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/personas")
public class PersonaController {

    @GetMapping()
    public ResponseEntity<Persona> getPersonlist(){
        Persona persona = new Persona("Veronica", "Pava", "Profesora");
        return new ResponseEntity<>(persona, HttpStatus.OK);
    }
}
