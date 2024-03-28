package com.nocnoc.ControladorTareas.models;

import jakarta.persistence.*;

@Entity
public class ArchivoAdjunto {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String nombreArchivo, tipoArchivo, urlAlmacenamient;
    @ManyToOne
    private Usuario usuario;
    @ManyToOne
    private Tarea tarea;

    public ArchivoAdjunto() {
    }

    public ArchivoAdjunto(String nombreArchivo, String tipoArchivo, String urlAlmacenamient, Usuario usuario,
                          Tarea tarea)
    {
        this.nombreArchivo = nombreArchivo;
        this.tipoArchivo = tipoArchivo;
        this.urlAlmacenamient = urlAlmacenamient;
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

    public String getUrlAlmacenamient() {
        return urlAlmacenamient;
    }

    public void setUrlAlmacenamient(String urlAlmacenamient) {
        this.urlAlmacenamient = urlAlmacenamient;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Tarea getTarea() {
        return tarea;
    }

    public void setTarea(Tarea tarea) {
        this.tarea = tarea;
    }
}
