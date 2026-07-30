package com.miaplicacion.demo.repository;

import com.miaplicacion.demo.Entity.Persona;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPersonaRepository {
    public void crearPersona(Persona persona);
    public List<Persona> traerPersonas();
}
