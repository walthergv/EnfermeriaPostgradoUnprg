package com.postgrado.postgradosistema.modelo;

import java.util.List;

public class Ciclo {
    private int id;
    private String nombre;
    private String es_ciclo;
    private List<Ingresante> ingresantes;

    public Ciclo() {
    }

    public Ciclo(int id) {
        this.id = id;
    }

    public Ciclo(String nombre) {
        this.nombre = nombre;
    }

    public Ciclo(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Ciclo(int id, String nombre, List<Ingresante> ingresantes) {
        this.id = id;
        this.nombre = nombre;
        this.ingresantes = ingresantes;
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

    public List<Ingresante> getIngresantes() {
        return ingresantes;
    }

    public void setIngresantes(List<Ingresante> ingresantes) {
        this.ingresantes = ingresantes;
    }

    public String getEs_ciclo() {
        return es_ciclo;
    }

    public void setEs_ciclo(String es_ciclo) {
        this.es_ciclo = es_ciclo;
    }


}
