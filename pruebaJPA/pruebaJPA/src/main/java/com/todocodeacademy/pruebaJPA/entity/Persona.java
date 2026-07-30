package com.todocodeacademy.pruebaJPA.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter@Setter
@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private String apellido;
    private Integer edad;


    //"name" referencia al nombre en la base de datos, "reference" referencia al nombre de la id en la clase mascota
    @OneToMany
    private List<Mascota> mascotas;

    // Constructors
    public Persona() {}

    public Persona(String nombre, String apellido, Integer edad, List<Mascota> mascotas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.mascotas = mascotas;
    }
}
