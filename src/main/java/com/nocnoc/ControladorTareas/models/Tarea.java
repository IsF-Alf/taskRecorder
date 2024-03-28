package com.nocnoc.ControladorTareas.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
@Entity
public class Tarea {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String titulo, descripcion;
    private EstadoTarea estado;
    private LocalDateTime fechaCreacion, fechaUltimaModificacion;
    @ManyToOne
    private Usuario usuarioAsignado;
    @OneToMany(mappedBy = "tarea", fetch = FetchType.EAGER)
    private Set<Comentario> comentarios = new HashSet<>();
    @OneToMany(mappedBy = "tarea", fetch = FetchType.EAGER)
    private Set<ArchivoAdjunto> archivosAdjuntos = new HashSet<>();

    public Tarea() {
    }
    public Tarea(String titulo, String descripcion, EstadoTarea estado, Usuario usuarioAsignado) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.estado = estado;
        this.usuarioAsignado = usuarioAsignado;
        this.fechaCreacion = LocalDateTime.now();
        this.fechaUltimaModificacion = LocalDateTime.now();
    }

    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public EstadoTarea getEstado() {
        return estado;
    }

    public void setEstado(EstadoTarea estado) {
        this.estado = estado;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDateTime getFechaUltimaModificacion() {
        return fechaUltimaModificacion;
    }

    public void setFechaUltimaModificacion(LocalDateTime fechaUltimaModificacion) {
        this.fechaUltimaModificacion = fechaUltimaModificacion;
    }

    public Usuario getUsuarioAsignado() {
        return usuarioAsignado;
    }

    public void setUsuarioAsignado(Usuario usuarioAsignado) {
        this.usuarioAsignado = usuarioAsignado;
    }

    public Set<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(Set<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    public Set<ArchivoAdjunto> getArchivosAdjuntos() {
        return archivosAdjuntos;
    }

    public void setArchivosAdjuntos(Set<ArchivoAdjunto> archivosAdjuntos) {
        this.archivosAdjuntos = archivosAdjuntos;
    }
}
