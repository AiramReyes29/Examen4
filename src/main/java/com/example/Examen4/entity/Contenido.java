package com.example.Examen4.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Contenido {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String nombre;
    private String descripcion;
    private int duracion;

    public int getDuracion() {
        return duracion;
    }
}
