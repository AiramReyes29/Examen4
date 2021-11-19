package com.example.Examen4.controller;


import com.example.Examen4.entity.Alumno;
import com.example.Examen4.repository.AlumnoRepository;
import com.example.Examen4.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AlumnoController {
    @Autowired
    private AlumnoService alumnoService;
    @Autowired
    private AlumnoRepository alumnoRepository;


    @GetMapping("/alumno/{nombre}/{edad}")
    public List<Alumno> getTeacherByNameyAge(@PathVariable("nombre") String nombre, @PathVariable("edad") Integer edad){
        return alumnoRepository.getAlumno(nombre,edad);
    }
}
