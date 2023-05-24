package com.postgrado.postgradosistema.modelo;

import java.util.List;

public class Area {
    private int id;
    private String nombre;
    private String es_area;

    private List<Especialidad> especialidades;

    public Area() {
    }

    public Area(String nombre) {
        this.nombre = nombre;
    }

    public Area(int id, String nombre, List<Especialidad> especialidades) {
        this.id = id;
        this.nombre = nombre;
        this.especialidades = especialidades;
    }

    public Area(int id, String nombre, String es_area) {
        this.id = id;
        this.nombre = nombre;
        this.es_area = es_area;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Especialidad> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(List<Especialidad> especialidades) {
        this.especialidades = especialidades;
    }

    public String getEs_area() {
        return es_area;
    }

    public void setEs_area(String es_area) {
        this.es_area = es_area;
    }

}
