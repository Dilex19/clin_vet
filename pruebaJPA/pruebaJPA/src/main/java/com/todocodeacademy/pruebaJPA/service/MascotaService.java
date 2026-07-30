package com.todocodeacademy.pruebaJPA.service;

import com.todocodeacademy.pruebaJPA.entity.Mascota;
import com.todocodeacademy.pruebaJPA.repository.IMascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotaService implements IMascotaService {

    @Autowired
    private IMascotaRepository mascotaRepo;

    @Override
    public List<Mascota> getMascotas() {
        return mascotaRepo.findAll();
    }

    @Override
    public void saveMascota(Mascota mascota) {
        mascotaRepo.save(mascota);
    }

    @Override
    public void deleteMascota(Long idMascota) {
        mascotaRepo.deleteById(idMascota);
    }

    @Override
    public Mascota getMascotaById(Long idMascota) {
        return mascotaRepo.findById(idMascota).orElse(null);
    }

    @Override
    public void editMascota(Long idOriginal, Long idMascotaNueva, String nombre, String especie, String raza, String color) {
        Mascota mascota = mascotaRepo.findById(idOriginal).orElse(null);
        if (mascota != null) {
            mascota.setId_mascota(idMascotaNueva);
            mascota.setNombre(nombre);
            mascota.setEspecie(especie);
            mascota.setRaza(raza);
            mascota.setColor(color);
            mascotaRepo.save(mascota);
        }
    }
}
