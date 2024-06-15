package com.nocnoc.ControladorTareas.models;

import jakarta.persistence.*;

@Entity
public class ArchivoAdjunto {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String nombreArchivo, tipoArchivo, urlAlmacenamiento;
    @ManyToOne
    private Usuario usuario;
    @ManyToOne
    private Task tarea;

    public ArchivoAdjunto() {
    }

    public ArchivoAdjunto(String nombreArchivo, String tipoArchivo, String urlAlmacenamiento, Usuario usuario,
                          Task tarea)
    {
        this.nombreArchivo = nombreArchivo;
        this.tipoArchivo = tipoArchivo;
        this.urlAlmacenamiento = urlAlmacenamiento;
        this.usuario = usuario;
        this.tarea = tarea;
    }

    public String getId() {
        return id;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getTipoArchivo() {
        return tipoArchivo;
    }

    public void setTipoArchivo(String tipoArchivo) {
        this.tipoArchivo = tipoArchivo;
    }

    public String getUrlAlmacenamiento() {
        return urlAlmacenamiento;
    }

    public void setUrlAlmacenamiento(String urlAlmacenamiento) {
        this.urlAlmacenamiento = urlAlmacenamiento;
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
