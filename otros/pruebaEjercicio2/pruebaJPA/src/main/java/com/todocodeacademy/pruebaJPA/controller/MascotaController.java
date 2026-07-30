package com.todocodeacademy.pruebaJPA.controller;

import com.todocodeacademy.pruebaJPA.dto.DuenioMascotaDTO;
import com.todocodeacademy.pruebaJPA.entity.Mascota;
import com.todocodeacademy.pruebaJPA.service.IMascotaService;
import com.todocodeacademy.pruebaJPA.service.MascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MascotaController {

    @Autowired
    private IMascotaService mascotaService;

    @GetMapping("/mascotas/traer")
    public List<Mascota> traerMascotas() {
        return mascotaService.getAllMascotas();
    }

    @GetMapping("/mascotas/traer/{id}")
    public Mascota traerMascota(@PathVariable Long id) {
        return mascotaService.getMascotaById(id);
    }

    @PostMapping("/mascotas/crear")
    public void crearMascota(@RequestBody Mascota mascota) {
        mascotaService.saveMascota(mascota);
    }

    @DeleteMapping("/mascotas/borrar/{id}")
    public void borrarMascota(@PathVariable Long id) {
        mascotaService.deleteMascota(id);
    }

    @PutMapping("/mascotas/edit")
    public void updateMascota(@RequestBody Mascota mascota) {
        mascotaService.updateMascota(mascota);
    }

    @GetMapping("/mascotas/caniches")
    public List<Mascota> traerCaniches() {
        return mascotaService.getAllCaniches();
    }

    @GetMapping("/mascotas/traer/{id}/duenio")
    public DuenioMascotaDTO traerMascotaYDuenio(@PathVariable Long id) {
        return mascotaService.getMascotaYDuenio(id);
    }
}
