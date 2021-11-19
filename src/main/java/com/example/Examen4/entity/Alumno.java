package com.example.Examen4.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "Alumno")

public class Alumno {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int dni;
    private String nombre;
    private String apellido;
    private String direccion;
    private String mail;

    @ElementCollection
    @Column(name= "expedienteList")
    List<Expediente> expedienteList;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMail() {
        return mail;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public List<Expediente> getExpedienteList() {
        return expedienteList;
    }
}
