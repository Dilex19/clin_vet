package com.todocodeacademy.pruebaJPA.service;

import com.todocodeacademy.pruebaJPA.dto.cursosTemaDTO;
import com.todocodeacademy.pruebaJPA.entity.Curso;
import com.todocodeacademy.pruebaJPA.entity.Tema;
import com.todocodeacademy.pruebaJPA.repository.ICursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CursoService implements ICursoService {
    @Autowired
    private ICursoRepository cursoRepo;

    @Override
    public List<Curso> findAllCurso() {
        return cursoRepo.findAll();
    }

    @Override
    public Curso findCursoById(Long id) {
        return cursoRepo.findById(id).orElse(null);
    }

    @Override
    public void saveCurso(Curso curso) {
        cursoRepo.save(curso);
    }

    @Override
    public void deleteCurso(Long id) {
        cursoRepo.deleteById(id);
    }

    @Override
    public void updateCurso(Curso curso) {
        this.saveCurso(curso);
    }

    @Override
    public cursosTemaDTO findAllTemasDeCurso(Long id) {
        Curso curso = this.findCursoById(id);
        if (curso != null) {
            List<Tema> lisTemas = curso.getListaDeTemas();
            cursosTemaDTO curTemaDTO= new cursosTemaDTO(lisTemas, curso.getNombre());

            return curTemaDTO;
        }
        return null;
    }

    @Override
    public List<Curso> findCursosDeJava() {
        List<Curso> cursos = this.findAllCurso();
        return cursos.stream().filter(curso -> (curso.getNombre().contains("Java"))).collect(Collectors.toList());
    }
}
