package com.todocodeacademy.pruebaJPA.service;

import com.todocodeacademy.pruebaJPA.entity.Tema;

import java.util.List;

public interface ITemaService {

     List<Tema> findAll();

     Tema findCursoById(Long id);

     void saveTema(Tema tema);

     void deleteTema(Long id);

     void updateTema(Tema tema);
}
