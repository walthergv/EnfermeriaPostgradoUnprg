package com.postgrado.postgradosistema.modelo;

public class Sede {
    private int id;
    private String nombre;
    private String es_sede;

    public Sede() {
    }

    public Sede(int id) {
        this.id = id;
    }

    public Sede(String nombre) {
        this.nombre = nombre;
    }

    public Sede(int id, String nombre, String es_sede) {
        this.id = id;
        this.nombre = nombre;
        this.es_sede = es_sede;
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

    public String getEs_sede() {
        return es_sede;
    }

    public void setEs_sede(String es_sede) {
        this.es_sede = es_sede;
    }

}
