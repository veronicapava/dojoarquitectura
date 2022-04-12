package com.dojo.cursos.controllers;

import com.dojo.cursos.model.Cursos;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cursos")
public class CursosController {

    @GetMapping()
    public ResponseEntity<Cursos> getcourselist(){
        Cursos curso = new Cursos("React", 100);
        System.out.println("El curso:" + curso.toString());
        return new ResponseEntity<>(curso, HttpStatus.OK);
    }
}
