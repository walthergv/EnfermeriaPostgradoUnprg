package com.postgrado.postgradosistema.modelo;

public class Especialidad {
    private int id;
    private String nombre;
    private Area area;
    private String es_especialidad;

    public Especialidad() {
    }

    public Especialidad(int id) {
        this.id = id;
    }

    public Especialidad(String nombre) {
        this.nombre = nombre;
    }

    public Especialidad(int id, String nombre, Area area, String es_especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.area = area;
        this.es_especialidad = es_especialidad;
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

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public String getEs_especialidad() {
        return es_especialidad;
    }

    public void setEs_especialidad(String es_especialidad) {
        this.es_especialidad = es_especialidad;
    }


    @Override
    public String toString() {
        return "Especialidad{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", area=" + area.getNombre() +
                '}';
    }
}
