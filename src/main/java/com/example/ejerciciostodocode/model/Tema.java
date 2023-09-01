package com.example.ejerciciostodocode.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Tema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_tema;
    private String nombre;
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "tema_id_curso")
    @JsonIgnore // para que no genere error desde Postman al llamar CURSOS
    private Curso cursito;

    public Tema() {
    }

    public Tema(Long id_tema, String nombre, String descripcion, Curso cursito) {
        this.id_tema = id_tema;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cursito = cursito;
    }
}
