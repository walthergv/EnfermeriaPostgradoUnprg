package com.postgrado.postgradosistema.modelo;

import java.util.ArrayList;
import java.util.List;

public class Proyecto {
    private int id;
    private String titulo;
    private String asesora;
    private String jurado;
    private String res_designacion;
    private String res_ejecucion;
    private String res_cambioJurado;
    private String res_sustentacion;
    private String res_nombramiento;
    private String otros;
    private String es_proyecto;
    private Especialidad especialidad;
    private List<Ingresante> ingresantes = new ArrayList<>();

    public Proyecto() {
    }

    public Proyecto(int id, String titulo, String asesora, String jurado, String res_designacion, String res_ejecucion, String res_cambioJurado, String res_sustentacion, String res_nombramiento, String otros, Especialidad especialidad) {
        this.id = id;
        this.titulo = titulo;
        this.asesora = asesora;
        this.jurado = jurado;
        this.res_designacion = res_designacion;
        this.res_ejecucion = res_ejecucion;
        this.res_cambioJurado = res_cambioJurado;
        this.res_sustentacion = res_sustentacion;
        this.res_nombramiento = res_nombramiento;
        this.otros = otros;
        this.especialidad = especialidad;
    }

    public Proyecto(int id, String titulo, String asesora, String jurado, String res_designacion, String res_ejecucion, String res_cambioJurado, String res_sustentacion, String res_nombramiento, String otros, Especialidad especialidad, List<Ingresante> ingresantes) {
        this.id = id;
        this.titulo = titulo;
        this.asesora = asesora;
        this.jurado = jurado;
        this.res_designacion = res_designacion;
        this.res_ejecucion = res_ejecucion;
        this.res_cambioJurado = res_cambioJurado;
        this.res_sustentacion = res_sustentacion;
        this.res_nombramiento = res_nombramiento;
        this.otros = otros;
        this.especialidad = especialidad;
        this.ingresantes = ingresantes;
    }

    public Proyecto(int id) {
        this.id = id;
    }

    public Proyecto(String titulo) {
        this.titulo = titulo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAsesora() {
        return asesora;
    }

    public void setAsesora(String asesora) {
        this.asesora = asesora;
    }

    public String getJurado() {
        return jurado;
    }

    public void setJurado(String jurado) {
        this.jurado = jurado;
    }

    public List<Ingresante> getIngresantes() {
        return ingresantes;
    }

    public void setIngresantes(List<Ingresante> ingresantes) {
        this.ingresantes = ingresantes;
    }

    public String getRes_designacion() {
        return res_designacion;
    }

    public void setRes_designacion(String res_designacion) {
        this.res_designacion = res_designacion;
    }

    public String getRes_ejecucion() {
        return res_ejecucion;
    }

    public void setRes_ejecucion(String res_ejecucion) {
        this.res_ejecucion = res_ejecucion;
    }

    public String getRes_cambioJurado() {
        return res_cambioJurado;
    }

    public void setRes_cambioJurado(String res_cambioJurado) {
        this.res_cambioJurado = res_cambioJurado;
    }

    public void setEs_proyecto(String es_proyecto) {
        this.es_proyecto = es_proyecto;
    }

    public String getEs_proyecto() {
        return es_proyecto;
    }

    public String getRes_sustentacion() {
        return res_sustentacion;
    }

    public void setRes_sustentacion(String res_sustentacion) {
        this.res_sustentacion = res_sustentacion;
    }

    public String getRes_nombramiento() {
        return res_nombramiento;
    }

    public void setRes_nombramiento(String res_nombramiento) {
        this.res_nombramiento = res_nombramiento;
    }

    public String getOtros() {
        return otros;
    }

    public void setOtros(String otros) {
        this.otros = otros;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Proyecto{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", asesora='" + asesora + '\'' +
                ", jurado='" + jurado + '\'' +
                ", res_designacion='" + res_designacion + '\'' +
                ", res_ejecucion='" + res_ejecucion + '\'' + "\n" +
                ", res_cambioJurado='" + res_cambioJurado + '\'' +
                ", res_sustentacion='" + res_sustentacion + '\'' +
                ", res_nombramiento='" + res_nombramiento + '\'' +
                ", otros='" + otros + '\'' +
                ", especialidad=" + especialidad.getNombre() + "\n" +
                '}';
    }
}
