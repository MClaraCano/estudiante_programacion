package com.example.ejerciciostodocode.controller;

import com.example.ejerciciostodocode.dto.CursoDTO;
import com.example.ejerciciostodocode.model.Curso;
import com.example.ejerciciostodocode.model.Tema;
import com.example.ejerciciostodocode.service.CursoService;
import com.example.ejerciciostodocode.service.ICursoService;
import com.example.ejerciciostodocode.service.ITemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/curso")
public class CursoController {

    @Autowired
    ICursoService iCursoService;

    //1. Crear un Curso nuevo
    @PostMapping("/crear")
    public ResponseEntity<Curso> crearCurso(@RequestBody Curso curso){
        return ResponseEntity.status(HttpStatus.CREATED).body(iCursoService.crearCurso(curso));
    }

    //3. Obtener todos los cursos
    @GetMapping("/mostrar")
    public ResponseEntity<List<Curso>> mostrarCursos(){
        List<Curso> listaCursos= iCursoService.mostrartodos();
        return ResponseEntity.status(HttpStatus.OK).body(listaCursos);
    }

    //4. Obtener todos los temas de un det curso
    @GetMapping("/traer/{idCursito}")
    public ResponseEntity<CursoDTO> traerTemasSegunCurso(@PathVariable Long idCursito){
        CursoDTO cursoDTO = iCursoService.traerTemasSegunCurso(idCursito);
        return ResponseEntity.status(HttpStatus.OK).body(cursoDTO);
    }

    //5. Obtener todos los cursos que tengan la palabra Java
    @GetMapping("/traer/java")
    public ResponseEntity<List<Curso>> traerCursosJava(){
        List<Curso> listaCurso = iCursoService.traerjava();
        return ResponseEntity.status(HttpStatus.OK).body(listaCurso);
    }

    //6. Modificar los datos de un curso
    @PutMapping("/modificar")
    public ResponseEntity<String> modificarCurso(@RequestBody Curso curso){
        iCursoService.modificarCurso(curso);
        return ResponseEntity.status(HttpStatus.OK).body("Curso modificado OK: " + curso);
    }


}
