package com.todocodeacademy.pruebaJPA.controller;

import com.todocodeacademy.pruebaJPA.entity.Tema;
import com.todocodeacademy.pruebaJPA.service.TemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TemaController {

    @Autowired
    private TemaService temaService;

    @GetMapping("/temas")
    public List<Tema> getAllTemas() {
        return temaService.findAll();
    }

    @PostMapping("/temas/crear")
    public void createTema(@RequestBody Tema tema) {
        temaService.saveTema(tema);
    }

    @PutMapping("/temas/editar")
    public void updateTema(@RequestBody Tema tema) {
        temaService.updateTema(tema);
    }
}
