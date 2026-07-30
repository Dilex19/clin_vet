package com.miaplicacion.demo.Controller;

import com.miaplicacion.demo.Entity.Paciente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

@RestController
public class HospitalController {
    @GetMapping("/hospital/paciente/traerTodos")
    public List<Paciente> listaPacientes(){

        List<Paciente> listaPacientes = new ArrayList<>();
        LocalDate cumpleanos = LocalDate.of(2010,3,12);
        listaPacientes.add(new Paciente(1L, "12345678", "Juan", "Perez", cumpleanos));
        listaPacientes.add(new Paciente(2L, "87654321", "Maria", "Gomez", LocalDate.of(1995,7,25)));
        listaPacientes.add(new Paciente(3L, "45678912", "Pedro", "Lopez", LocalDate.of(1988,11,5)));
        listaPacientes.add(new Paciente(4L, "98765432", "Ana", "Martinez", LocalDate.of(2022,1,18)));
        return listaPacientes;
    }


    @GetMapping("/hospital/paciente/traerMenores")
    public List<Paciente> listaPacientesMenores(){
        List<Paciente> listaPacientes = new ArrayList<>();
        LocalDate cumpleanos = LocalDate.of(2010,3,12);
        listaPacientes.add(new Paciente(1L, "12345678", "Juan", "Perez", cumpleanos));
        listaPacientes.add(new Paciente(2L, "87654321", "Maria", "Gomez", LocalDate.of(1995,7,25)));
        listaPacientes.add(new Paciente(3L, "45678912", "Pedro", "Lopez", LocalDate.of(1988,11,5)));
        listaPacientes.add(new Paciente(4L, "98765432", "Ana", "Martinez", LocalDate.of(2022,1,18)));

        List <Paciente> pacientesMenores = new ArrayList<>();

        for(Paciente paciente : listaPacientes){
            LocalDate nacimiento = paciente.getFechaNacimiento();
            LocalDate ahora = LocalDate.now();
            int edad = Period.between(nacimiento, ahora).getYears();
            if(edad < 18){
                pacientesMenores.add(paciente);
            }
        }
        return pacientesMenores;
    }
}
