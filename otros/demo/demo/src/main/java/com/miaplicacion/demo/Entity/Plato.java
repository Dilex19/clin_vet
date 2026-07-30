package com.miaplicacion.demo.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Plato {

    private Long id;
    private String nombre;
    private double precio;
    private String descripcion;

    public Plato() {
    }

    public Plato(Long id, String nombre, double precio, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }

}
