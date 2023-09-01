package com.example.ejerciciostodocode.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.security.PrivilegedAction;
import java.time.LocalDate;
import java.util.List;

@Getter @Setter @Data
@Entity
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_curso;
    private String nombre;
    private String modalidad;

    //private ModalidadCursoEnum modalidadEmun;
    private LocalDate fecha_finalizacion;

    @OneToMany(mappedBy = "cursito")
    private List<Tema> listaDeTemas;

    public Curso() {
    }

    public Curso(Long id_curso, String nombre, String modalidad, LocalDate fecha_finalizacion, List<Tema> listaDeTemas) {
        this.id_curso = id_curso;
        this.nombre = nombre;
        this.modalidad = modalidad;
        this.fecha_finalizacion = fecha_finalizacion;
        this.listaDeTemas = listaDeTemas;
    }
}
