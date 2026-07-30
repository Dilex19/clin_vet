package com.miaplicacion.demo.service;

import com.miaplicacion.demo.Entity.Persona;

import java.util.List;

public interface IPersonaService {

    public void crearPersona(Persona per);
    public List<Persona> traerPersonas();
}
