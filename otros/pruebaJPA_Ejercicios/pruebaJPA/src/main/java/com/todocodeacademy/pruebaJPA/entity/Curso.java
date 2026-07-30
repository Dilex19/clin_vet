package com.todocodeacademy.pruebaJPA.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter@Setter
@Entity
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_curso;
    private String nombre;
    private String modalidad;
    private Date fecha_finalización;

    @OneToMany(mappedBy = "curso", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Tema> listaDeTemas;

    public Curso(){
    }

    public Curso(String nombre, String modalidad, Date fecha_finalización, List<Tema> listaDeTemas) {
        this.nombre = nombre;
        this.modalidad = modalidad;
        this.fecha_finalización = fecha_finalización;
        this.listaDeTemas = listaDeTemas;
    }
}
