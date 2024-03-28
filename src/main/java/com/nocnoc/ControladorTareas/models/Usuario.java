package com.nocnoc.ControladorTareas.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String nombre, email, contraseña;
    private RolAsignado rol;
    private String tokenRestablecimiento;
    private LocalDateTime fechaRegistro;

    public Usuario() {
    }

    public Usuario(String nombre, String email, String contraseña, RolAsignado rol)
    {
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
        this.rol = rol;
        this.fechaRegistro = LocalDateTime.now();
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public RolAsignado getRol() {
        return rol;
    }

    public void setRol(RolAsignado rol) {
        this.rol = rol;
    }

    public String getTokenRestablecimiento() {
        return tokenRestablecimiento;
    }

    public void setTokenRestablecimiento(String tokenRestablecimiento) {
        this.tokenRestablecimiento = tokenRestablecimiento;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}
