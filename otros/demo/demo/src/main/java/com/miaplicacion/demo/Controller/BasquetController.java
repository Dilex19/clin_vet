package com.miaplicacion.demo.Controller;

import com.miaplicacion.demo.Entity.Jugador;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BasquetController {

    @PostMapping("/basquet")
    public String jugadoresBasquet(@RequestBody List<Jugador> listaJugadores) {

        List<Jugador> jugadores = listaJugadores;



        return "hola";
    }
}
