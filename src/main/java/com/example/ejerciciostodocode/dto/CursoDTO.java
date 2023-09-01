package com.example.ejerciciostodocode.dto;

import com.example.ejerciciostodocode.model.Tema;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class CursoDTO {

    private String nombre;
    private List<Tema> listaDeTemas;

    public CursoDTO() {
    }

    public CursoDTO(String nombre, List<Tema> listaDeTemas) {
        this.nombre = nombre;
        this.listaDeTemas = listaDeTemas;
    }
}
