package com.todocodeacademy.pruebaJPA.service;


import com.todocodeacademy.pruebaJPA.dto.cursosTemaDTO;
import com.todocodeacademy.pruebaJPA.entity.Curso;
import com.todocodeacademy.pruebaJPA.entity.Tema;

import java.util.List;

public interface ICursoService {

    List<Curso> findAllCurso();

    Curso findCursoById(Long id);

    void saveCurso(Curso curso);

    void deleteCurso(Long id);

    void updateCurso(Curso curso);

    cursosTemaDTO findAllTemasDeCurso(Long id);

    List<Curso> findCursosDeJava();
}
