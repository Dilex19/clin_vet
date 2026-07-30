package com.todocodeacademy.pruebaJPA.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Mascota {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_mascota;
    private String nombre;
    private String especie;
    private String raza;
    private String color;


    public Mascota() {}

    public Mascota(String nombre, String especie, String raza, String color) {
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.color = color;
    }
}
