package com.miaplicacion.demo.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Persona {
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;

    public Persona() {

    }

    public Persona(String nombre, String apellido, String email, String telefono) {

    }
}
