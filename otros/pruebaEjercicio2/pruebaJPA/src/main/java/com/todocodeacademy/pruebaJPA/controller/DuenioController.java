package com.todocodeacademy.pruebaJPA.controller;

import com.todocodeacademy.pruebaJPA.entity.Duenio;
import com.todocodeacademy.pruebaJPA.entity.Mascota;
import com.todocodeacademy.pruebaJPA.service.IDuenioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DuenioController {

    @Autowired
    private IDuenioService duenioService;

    @GetMapping("/duenios/traer")
    public List<Duenio> getAllDuenios() {
        return duenioService.getAllDuenios();
    }

    @GetMapping("/duenios/traer/{id}")
    public Duenio getDuenioById(@PathVariable Long id) {
        return duenioService.getDuenioById(id);
    }

    @PostMapping("/duenios/crear")
    public void createDuenio(@RequestBody Duenio duenio) {
        duenioService.saveDuenio(duenio);
    }

    @DeleteMapping("/duenios/borrar/{id}")
    public void deleteDuenio(@PathVariable Long id) {
        duenioService.deleteDuenio(id);
    }

    @PutMapping("/duenios/edit")
    public void updateDuenio(@RequestBody Duenio duenio) {
        duenioService.updateDuenio(duenio);
    }
}
