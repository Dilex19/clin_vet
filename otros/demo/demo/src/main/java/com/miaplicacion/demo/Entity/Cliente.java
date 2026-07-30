package com.miaplicacion.demo.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cliente {

    private Long id;
    private String nombre;
    private String apellido;

    public Cliente(long l, String zlatan, String ibrahimovic) {
        this.id = l;
        this.nombre = zlatan;
        this.apellido = ibrahimovic;
    }
}
