package com.todocodeacademy.pruebaJPA.repository;

import com.todocodeacademy.pruebaJPA.entity.Persona;
import com.todocodeacademy.pruebaJPA.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long> {
}
