package com.todocodeacademy.pruebaJPA.controller;

import com.todocodeacademy.pruebaJPA.dto.cursosTemaDTO;
import com.todocodeacademy.pruebaJPA.entity.Curso;
import com.todocodeacademy.pruebaJPA.entity.Tema;
import com.todocodeacademy.pruebaJPA.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CursoController {

    @Autowired
    private CursoService cursoService;


    @GetMapping("/cursos/traer")
    public List<Curso> getAllCursos() {
        return cursoService.findAllCurso();
    }

    @PostMapping("/cursos/crear")
    public void createCurso(@RequestBody Curso curso) {
        cursoService.saveCurso(curso);
    }

    @GetMapping("/cursos/{cursoId}/temas")
    public cursosTemaDTO getAllTemasDeCurso(@PathVariable Long cursoId) {
        return cursoService.findAllTemasDeCurso(cursoId);
    }

    @GetMapping("/cursos/java")
    public List<Curso> findCursosDeJava() {
        return cursoService.findCursosDeJava();
    }

    @PutMapping("/cursos/editar")
    public void updateCurso(@RequestBody Curso curso) {
        cursoService.updateCurso(curso);
    }
}
