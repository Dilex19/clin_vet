package com.todocodeacademy.pruebaJPA.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
@Entity
public class Tema {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_tema;
    private String nombre;
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "id_curso")
    private Curso curso;


    public Tema(){}

    public Tema(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
}
