package com.example.ejerciciostodocode.controller;

import com.example.ejerciciostodocode.model.Tema;
import com.example.ejerciciostodocode.service.ICursoService;
import com.example.ejerciciostodocode.service.ITemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tema")
public class TemaController {

    @Autowired
    ITemaService iTemaService;

    //2. Crear Tema y asociar Curso
    @PostMapping("/crear")
    public ResponseEntity<Tema> crearTema(@RequestBody Tema tema){
        return ResponseEntity.status(HttpStatus.CREATED).body(iTemaService.crearTema(tema));
    }




}
