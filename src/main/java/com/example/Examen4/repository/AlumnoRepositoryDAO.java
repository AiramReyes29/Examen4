package com.example.Examen4.repository;

import com.example.Examen4.entity.Alumno;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AlumnoRepositoryDAO extends CrudRepository <Alumno,String> {

    public List<Alumno> buscarAlumno(String nombre, Integer edad);

    @Query(value = "Select * from alumno where nombredecurso=:nombredecurso and fechainscripcion=:fechainscripcion", nativeQuery = true)

    public List<Alumno> findAlumnoByNombreAndEdadPorQueryNativa (String nombre, Integer edad);

    @Query(value = "Select t from alumno t where t.nombre=?1 and t.edad=?2")

    public List<Alumno> findAlumnoByNombreAndEdadPorJPQL (String nombre, Integer edad);


}
