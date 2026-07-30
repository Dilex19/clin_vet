package com.miaplicacion.demo.Controller;

import com.miaplicacion.demo.Entity.Plato;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RestauranteController {

    @GetMapping("/restaurante/plato/{numPlato}")
    public Plato obtenerDatosDePlato(@PathVariable int numPlato) {
        
        List<Plato> platos = new ArrayList<>();
        Plato plato = new Plato(1L, "Pizza", 10.99, "Deliciosa pizza con queso y pepperoni");
        platos.add(plato);
        plato = new Plato(2L, "Hamburguesa", 8.99, "Jugosa hamburguesa con lechuga, tomate y queso");
        platos.add(plato);
        plato = new Plato(3L, "Ensalada", 6.99, "Fresca ensalada con variedad de vegetales y aderezo");
        platos.add(plato);
        plato = new Plato(4L, "Pasta", 9.99,    "Pasta al dente con salsa de tomate y albahaca");
        platos.add(plato);

        return platos.get(numPlato-1);
    }
}
