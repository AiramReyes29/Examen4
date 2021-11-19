package com.example.Examen4.repository;

import com.example.Examen4.entity.Alumno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AlumnoRepository {
    @Autowired

    AlumnoRepositoryDAO alumnoRepositoryDAO;

    @Autowired

    AlumnoRepository alumnoRepository;

    public void creacionAlumno(Alumno alumno) {
    }

    public List<Alumno> getAlumno(String nombre, Integer edad) {
        return alumnoRepositoryDAO.buscarAlumno(nombre,edad);
    }
}
