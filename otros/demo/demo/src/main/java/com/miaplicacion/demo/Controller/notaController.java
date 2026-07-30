package com.miaplicacion.demo.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class notaController {


    @GetMapping("/nota")
    public String calcularNota(@RequestParam double nota1,
                               @RequestParam double nota2,
                               @RequestParam double nota3){

        double promedio = (nota1 + nota2 + nota3) / 3;

        return "La nota final es: " + promedio;

    }
}
