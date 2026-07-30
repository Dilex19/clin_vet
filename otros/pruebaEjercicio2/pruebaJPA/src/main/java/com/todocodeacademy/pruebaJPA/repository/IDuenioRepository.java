package com.todocodeacademy.pruebaJPA.repository;

import com.todocodeacademy.pruebaJPA.entity.Duenio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDuenioRepository extends JpaRepository<Duenio,Long> {
}
