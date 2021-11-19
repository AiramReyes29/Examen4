package com.example.Examen4.entity;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import java.util.List;

public class Curso {

    @ElementCollection
    @Column(name= "contenidoList")
    List<Contenido> contenidoList;
}
