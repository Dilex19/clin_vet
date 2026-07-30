package com.todocodeacademy.pruebaJPA.service;

import com.todocodeacademy.pruebaJPA.dto.DuenioMascotaDTO;
import com.todocodeacademy.pruebaJPA.entity.Duenio;

import java.util.List;

public interface IDuenioService {

    List<Duenio> getAllDuenios();

    Duenio getDuenioById(Long id);

    void saveDuenio(Duenio duenio);

    void deleteDuenio(Long id);

    void  updateDuenio(Duenio duenio);
}
