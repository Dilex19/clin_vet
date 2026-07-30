package com.miaplicacion.demo.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Jugador {
    private Long id;
    private String dni;
    private String nombre;
    private String apellido;
    private int edad;
    private double peso;
    private double estatura;

    public Jugador() {}

    public Jugador(String dni, Long id, int edad, String apellido, String nombre, double estatura, double peso) {
        this.dni = dni;
        this.id = id;
        this.edad = edad;
        this.apellido = apellido;
        this.nombre = nombre;
        this.estatura = estatura;
        this.peso = peso;
    }
}
