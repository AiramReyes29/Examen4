package com.example.Examen4.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;



public class Expediente {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Date fechaInsc;
    private int calificacion;
    private Date fechaFin;
    private Curso curso;


    public Curso getCurso() {
        return curso;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public Date getFechaInsc() {
        return fechaInsc;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setFechaInsc(Date fechaInsc) {
        this.fechaInsc = fechaInsc;
    }

}
