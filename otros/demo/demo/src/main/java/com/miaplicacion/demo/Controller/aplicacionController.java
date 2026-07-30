package com.miaplicacion.demo.Controller;

import com.miaplicacion.demo.Entity.Cliente;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class aplicacionController {

    @PostMapping("/cliente")
    public void nuevoCliente(@RequestBody Cliente cli) {

        //probamos que nos devuelva por consola del servidor
        //los datos que recibimos desde el cliente mediante el body de la solicitud
        System.out.println("Datos del cliente. Nombre " + cli.getNombre()
                + " Apellido: " + cli.getApellido());
    }
}
