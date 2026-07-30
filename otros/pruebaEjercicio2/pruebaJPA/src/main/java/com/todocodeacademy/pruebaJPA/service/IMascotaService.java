package com.todocodeacademy.pruebaJPA.service;

import com.todocodeacademy.pruebaJPA.dto.DuenioMascotaDTO;
import com.todocodeacademy.pruebaJPA.entity.Mascota;

import java.util.List;

public interface IMascotaService {

    List<Mascota> getAllMascotas();

    Mascota getMascotaById(Long id);

    void saveMascota(Mascota mascota);

    void deleteMascota(Long id);

    void updateMascota(Mascota mascota);

    List<Mascota> getAllCaniches();

    DuenioMascotaDTO getMascotaYDuenio(Long idMascota);
}
