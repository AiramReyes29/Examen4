package com.example.Examen4.service;

import com.example.Examen4.entity.Alumno;
import com.example.Examen4.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoService {
    @Autowired
    AlumnoRepository AlumnoRepo;

    public void addAlumno(Alumno alumno){
        AlumnoRepo.creacionAlumno(alumno);
    }

    public List<Alumno> getLista() {

        return null;
    }

    public Alumno getAlumno(String nombre){
        return null;
    }
}
