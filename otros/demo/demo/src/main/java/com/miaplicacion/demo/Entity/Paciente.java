package com.miaplicacion.demo.Entity;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Getter@Setter
public class Paciente {
    //id, dni, nombre, apellido y fecha de nacimiento
    private Long id;
    private String dni;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;;

    public Paciente() {}

    public Paciente(Long id, String dni, String nombre, String apellido, LocalDate fechaNacimiento) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

}
