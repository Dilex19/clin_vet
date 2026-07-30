package com.todocodeacademy.pruebaJPA.service;

import com.todocodeacademy.pruebaJPA.dto.DuenioMascotaDTO;
import com.todocodeacademy.pruebaJPA.entity.Duenio;
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
    public List<Mascota> getAllMascotas() {
        return mascotaRepo.findAll();
    }

    @Override
    public Mascota getMascotaById(Long id) {
        return mascotaRepo.findById(id).orElse(null);
    }

    @Override
    public void saveMascota(Mascota mascota) {
        mascotaRepo.save(mascota);
    }

    @Override
    public void deleteMascota(Long id) {
        mascotaRepo.deleteById(id);
    }

    @Override
    public void updateMascota(Mascota mascota) {
        mascotaRepo.save(mascota);

    }

    @Override
    public List<Mascota> getAllCaniches() {
        List<Mascota> mascotas = this.getAllMascotas();
        return mascotas.stream().filter(m -> "Perro".equals(m.getEspecie()))
                                .filter(m -> "Caniche".equals(m.getRaza()))
                                .collect(java.util.stream.Collectors.toList());
    }

    @Override
    public DuenioMascotaDTO getMascotaYDuenio(Long idMascota) {
        Mascota mascota = getMascotaById(idMascota);
        Duenio duenio = mascota.getDuenio();

        DuenioMascotaDTO dto = new DuenioMascotaDTO();
        dto.setNombre_mascota(mascota.getNombre());
        dto.setEspecie(mascota.getEspecie());
        dto.setRaza(mascota.getRaza());
        dto.setNombre_duenio(duenio.getNombre());
        dto.setApellido_duenio(duenio.getApellido());

        return dto;
    }
}
