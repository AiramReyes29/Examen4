package com.example.Examen4.entity;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import java.util.List;

public class Modulo extends Contenido{
    private int duracion;

    @ElementCollection
    @Column(name= "contenidoList")
    List<Contenido> contenidosList;

    public int getDuracion(){
        return duracion;
    }
}
