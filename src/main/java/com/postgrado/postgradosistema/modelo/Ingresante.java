package com.postgrado.postgradosistema.modelo;

public class Ingresante {
    private int id;
    private String dni;
    private String nombre;
    private String codigo;
    private Ciclo ciclo;
    private Especialidad especialidad;
    private Sede sede;
    private Proyecto proyecto;
    private String es_ingresante;

    public Ingresante() {
    }

    public Ingresante(int id, String dni, String nombre, String codigo) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public Ingresante(int id, String dni, String nombre, String codigo, Ciclo ciclo, Especialidad especialidad, Sede sede, Proyecto proyecto) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.codigo = codigo;
        this.ciclo = ciclo;
        this.especialidad = especialidad;
        this.sede = sede;
        this.proyecto = proyecto;
    }

    public Ingresante(String dni, String nombre, String codigo, Ciclo ciclo, Especialidad especialidad, Sede sede, Proyecto proyecto) {
        this.dni = dni;
        this.nombre = nombre;
        this.codigo = codigo;
        this.ciclo = ciclo;
        this.especialidad = especialidad;
        this.sede = sede;
        this.proyecto = proyecto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEs_ingresante() {
        return es_ingresante;
    }

    public void setEs_ingresante(String es_ingresante) {
        this.es_ingresante = es_ingresante;
    }

    public Ciclo getCiclo() {
        return ciclo;
    }

    public void setCiclo(Ciclo ciclo) {
        this.ciclo = ciclo;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    @Override
    public String toString() {
        return "Ingresante{" +
                "id=" + id +
                ", dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", ciclo=" + ciclo.getNombre() +
                ", especialidad=" + especialidad.getNombre() +
                ", sede=" + sede.getNombre() +
                ", proyecto=" + proyecto.getTitulo() +
                '}';
    }
}
