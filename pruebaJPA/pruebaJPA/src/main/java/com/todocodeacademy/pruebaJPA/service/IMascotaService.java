package com.todocodeacademy.pruebaJPA.service;


import com.todocodeacademy.pruebaJPA.entity.Mascota;

import java.util.List;

public interface IMascotaService {

    public List<Mascota> getMascotas();

    public void saveMascota(Mascota mascota);

    public void deleteMascota(Long idMascota);

    public Mascota getMascotaById(Long idMascota);

    public void editMascota(Long idOriginal,
                            Long idMascotaNueva,
                            String nombre,
                            String especie,
                            String raza,
                            String color);
}
