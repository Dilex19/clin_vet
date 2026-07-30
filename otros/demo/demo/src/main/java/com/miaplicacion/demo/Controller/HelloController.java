package com.miaplicacion.demo.Controller;

import com.miaplicacion.demo.Entity.Cliente;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }

    @GetMapping("/suma/{num1}/{num2}")
    public String helloAll(@PathVariable int num1,
                           @PathVariable int num2) {
        int suma = num1 + num2;
        return "La suma es "+ num1 + "+" + num2 + " = " + suma;
    }

    @GetMapping("/IMC")
    public String calcularIMC(@RequestParam double imc) {
        if (imc <= 18.5) {
            return "Bajo peso";
        } else if (imc < 25) {
            return "Peso normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else {
            return "Obesidad";
        }
    }

    @GetMapping("/galones-a-litros/{galones}")
    public String calcularGalonesALitros(@PathVariable double galones) {
        double litros = galones * 3.78541;
        return "La cantidad de " + galones + " galones es equivalente a " + litros + " litros.";

    }

    @GetMapping("/cliente/traer")
    @ResponseBody
    public List<Cliente> traerClientes() {

        List<Cliente> listaClientes = new ArrayList<Cliente>();
        listaClientes.add(new Cliente(1L, "Zlatan", "Ibrahimovic"));
        listaClientes.add(new Cliente(2L, "Cristiano", "Ronaldo"));
        listaClientes.add(new Cliente(3L, "Lionel", "Messi"));

        return listaClientes;
    }

    @GetMapping("/pruebaresponse")
    public ResponseEntity<String> traerRespuesta() {

        return new ResponseEntity<>("Esto es un mensaje Response Entity", HttpStatus.OK);

    }


}
