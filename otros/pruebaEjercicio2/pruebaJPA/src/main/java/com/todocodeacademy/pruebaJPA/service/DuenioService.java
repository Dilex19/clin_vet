package com.todocodeacademy.pruebaJPA.service;

import com.todocodeacademy.pruebaJPA.entity.Duenio;
import com.todocodeacademy.pruebaJPA.repository.IDuenioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DuenioService implements IDuenioService {

    @Autowired
    private IDuenioRepository duenioRepo;

    @Override
    public List<Duenio> getAllDuenios() {
        return duenioRepo.findAll();
    }

    @Override
    public Duenio getDuenioById(Long id) {
        return duenioRepo.findById(id).orElse(null);
    }

    @Override
    public void saveDuenio(Duenio duenio) {
        duenioRepo.save(duenio);
    }

    @Override
    public void deleteDuenio(Long id) {
        duenioRepo.deleteById(id);
    }

    @Override
    public void updateDuenio(Duenio duenio) {
        duenioRepo.save(duenio);
    }
}
