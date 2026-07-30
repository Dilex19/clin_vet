package com.todocodeacademy.pruebaJPA.service;

import com.todocodeacademy.pruebaJPA.entity.Tema;
import com.todocodeacademy.pruebaJPA.repository.ITemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemaService implements ITemaService {

    @Autowired
    private ITemaRepository temaRepo;

    @Override
    public List<Tema> findAll() {
        return temaRepo.findAll();
    }

    @Override
    public Tema findCursoById(Long id) {
        return temaRepo.findById(id).orElse(null);
    }

    @Override
    public void saveTema(Tema tema) {
        temaRepo.save(tema);
    }

    @Override
    public void deleteTema(Long id) {
        temaRepo.deleteById(id);
    }

    @Override
    public void updateTema(Tema tema) {
        this.temaRepo.save(tema);
    }
}
