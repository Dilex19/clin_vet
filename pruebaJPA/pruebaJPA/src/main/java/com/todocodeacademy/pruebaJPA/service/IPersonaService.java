package com.todocodeacademy.pruebaJPA.service;

import com.todocodeacademy.pruebaJPA.entity.Persona;

import java.util.List;

public interface IPersonaService {

    //lectura
    public List<Persona> getPersonas();

    //alta
    public void savePersona(Persona persona);

    //baja
    public void deletePersona(Long id);

    //lectura de una persona
    public Persona findPersona(Long id);

    public void editPersona(Long idOriginal,
                            Long idNueva,
                            String nuevoNombre,
                            String nuevoApellido,
                            int nuevaEdad);

    public void editPersona(Persona persona);
}
