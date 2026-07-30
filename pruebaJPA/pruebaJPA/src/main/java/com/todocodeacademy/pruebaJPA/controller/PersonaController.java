package com.todocodeacademy.pruebaJPA.controller;

import com.todocodeacademy.pruebaJPA.entity.Persona;
import com.todocodeacademy.pruebaJPA.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonaController {

    @Autowired
    private IPersonaService personaService;

    @GetMapping("/personas/traer")
    public List<Persona> getPersonas() {
        return personaService.getPersonas();
    }

    @PostMapping("/personas/crear")
    public String savePersona(@RequestBody Persona persona) {
        personaService.savePersona(persona);
        return "OK";
    }

    @DeleteMapping("/personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id) {
        personaService.deletePersona(id);
        return "OK, eliminada";
    }

    @PutMapping("/personas/editar/{id_modificar}")
    public Persona updatePersona(@PathVariable Long id_modificar,
                                @RequestParam(required = false, name = "id") Long idNuevo,
                                @RequestParam(required = false, name = "nombre") String nuevoNombre,
                                @RequestParam(required = false, name = "apellido") String nuevoApellido,
                                @RequestParam(required = false, name = "edad") int nuevaEdad) {

        personaService.editPersona(id_modificar, idNuevo, nuevoNombre, nuevoApellido, nuevaEdad);

        return personaService.findPersona(idNuevo);
    }

    @PutMapping("/personas/editar")
    public Persona updatePersona(@RequestBody Persona persona) {
        personaService.editPersona(persona);
        return personaService.findPersona(persona.getId());
    }
}
