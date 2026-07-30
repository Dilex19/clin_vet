package com.miaplicacion.demo.service;

import com.miaplicacion.demo.Entity.Persona;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements IPersonaService {
    @Override
    public void crearPersona(Persona per) {
        System.out.println("Creando Persona");
    }

    @Override
    public List<Persona> traerPersonas() {
        System.out.println("Trayendo Personas");
        return null;
    }
}
