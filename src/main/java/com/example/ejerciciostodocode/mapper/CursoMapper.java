package com.example.ejerciciostodocode.mapper;

import com.example.ejerciciostodocode.dto.CursoDTO;
import com.example.ejerciciostodocode.model.Curso;

public class CursoMapper {

    public CursoDTO dtoACurso(Curso curso){
        CursoDTO cursoDTO = new CursoDTO();
        cursoDTO.setNombre(curso.getNombre());
        cursoDTO.setListaDeTemas(curso.getListaDeTemas());
        return cursoDTO;
    }

}
