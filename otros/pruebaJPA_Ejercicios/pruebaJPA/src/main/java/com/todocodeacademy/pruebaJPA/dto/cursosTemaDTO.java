package com.todocodeacademy.pruebaJPA.dto;

import com.todocodeacademy.pruebaJPA.entity.Tema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter@Setter
public class cursosTemaDTO implements Serializable {
    private List<Tema> temaList;
    private String nombreCurso;

    public cursosTemaDTO() {}

    public cursosTemaDTO(List<Tema> temaList, String nombreCurso) {
        this.temaList = temaList;
        this.nombreCurso = nombreCurso;
    }
}
