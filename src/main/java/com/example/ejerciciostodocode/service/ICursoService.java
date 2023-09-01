package com.example.ejerciciostodocode.service;

import com.example.ejerciciostodocode.dto.CursoDTO;
import com.example.ejerciciostodocode.model.Curso;
import com.example.ejerciciostodocode.model.Tema;

import java.util.List;

public interface ICursoService {
    Curso crearCurso(Curso curso);

    List<Curso> mostrartodos();

    CursoDTO traerTemasSegunCurso(Long idCursito);

    List<Curso> traerjava();

    Curso modificarCurso(Curso curso);
}
