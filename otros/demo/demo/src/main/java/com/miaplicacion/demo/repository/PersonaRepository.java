package com.miaplicacion.demo.repository;

import com.miaplicacion.demo.Entity.Persona;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PersonaRepository implements IPersonaRepository {
    @Override
    public void crearPersona(Persona per) {
        // Implementación para crear una persona en la base de datos
    }

    @Override
    public List<Persona> traerPersonas() {
        // Implementación para traer todas las personas de la base de datos
        return new ArrayList<Persona>();
    }
}
