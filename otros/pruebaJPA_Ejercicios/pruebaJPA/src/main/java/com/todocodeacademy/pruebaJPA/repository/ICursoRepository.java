package com.todocodeacademy.pruebaJPA.repository;

import com.todocodeacademy.pruebaJPA.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICursoRepository extends JpaRepository<Curso, Long> {
}
