package com.nocnoc.ControladorTareas.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;
@Entity
public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String contenido;
    private LocalDateTime fechaCreacion;
    private Usuario usuario;
    @ManyToOne
    private Task tarea;

    public Comentario() {
    }

    public Comentario(String contenido, Usuario usuario, Task tarea) {
        this.contenido = contenido;
        this.usuario = usuario;
        this.tarea = tarea;
        this.fechaCreacion = LocalDateTime.now();
    }

    public String getId() {
        return id;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Task getTarea() {
        return tarea;
    }

    public void setTarea(Task tarea) {
        this.tarea = tarea;
    }
}
