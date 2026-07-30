package com.todocodeacademy.pruebaJPA.service;

import com.todocodeacademy.pruebaJPA.entity.Persona;
import com.todocodeacademy.pruebaJPA.repository.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    IPersonaRepository persoRepo;

    @Override
    public List<Persona> getPersonas() {
        return persoRepo.findAll();
    }

    @Override
    public void savePersona(Persona persona) {
        persoRepo.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        return persoRepo.findById(id).orElse(null);
    }

    @Override
    public void editPersona(Long idOriginal, Long idNueva, String nuevoNombre, String nuevoApellido, int nuevaEdad) {
        Persona persona = this.findPersona(idOriginal);
        if (persona != null) {
            persona.setId(idNueva);
            persona.setNombre(nuevoNombre);
            persona.setApellido(nuevoApellido);
            persona.setEdad(nuevaEdad);

            this.savePersona(persona);
        }
    }

    @Override
    public void editPersona(Persona persona) {
        this.savePersona(persona);
    }
}
