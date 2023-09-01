package com.example.ejerciciostodocode.service;

import com.example.ejerciciostodocode.dto.CursoDTO;
import com.example.ejerciciostodocode.mapper.CursoMapper;
import com.example.ejerciciostodocode.model.Curso;
import com.example.ejerciciostodocode.model.Tema;
import com.example.ejerciciostodocode.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CursoService implements ICursoService {

    @Autowired
    CursoRepository cursoRepository;

    @Override
    public Curso crearCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    @Override
    public List<Curso> mostrartodos() {
        return cursoRepository.findAll();
    }


    public Curso traerCurso(Long id){
        Curso curso = cursoRepository.findById(id).orElse(null);
        return curso;
    }

    @Override
    public CursoDTO traerTemasSegunCurso(Long idCursito) {
         Curso curso = this.traerCurso(idCursito);

         CursoDTO cursoDTO = new CursoDTO();
         cursoDTO.setNombre(curso.getNombre());
         cursoDTO.setListaDeTemas(curso.getListaDeTemas());

         return cursoDTO;
    }


    @Override
    public List<Curso> traerjava() {
        List<Curso> listaCursos = cursoRepository.findAll();
        List<Curso> listaJava = new ArrayList<>(); // Creo NUEVA lista, porque si no, ya contiene los valores

        for (Curso cursito : listaCursos){
            if (cursito.getNombre().contains("Java")){
                listaJava.add(cursito);
            }
        }

        return listaJava;
    }

    @Override
    public Curso modificarCurso(Curso curso) {
        Curso curso1 = this.crearCurso(curso);
        return curso1;
    }


}
