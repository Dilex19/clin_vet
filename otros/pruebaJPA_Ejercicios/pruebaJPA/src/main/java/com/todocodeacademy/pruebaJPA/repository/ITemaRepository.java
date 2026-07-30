package com.todocodeacademy.pruebaJPA.repository;

import com.todocodeacademy.pruebaJPA.entity.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITemaRepository extends JpaRepository<Tema, Long> {
}
