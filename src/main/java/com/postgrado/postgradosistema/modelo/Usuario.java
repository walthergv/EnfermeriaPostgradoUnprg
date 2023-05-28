package com.postgrado.postgradosistema.modelo;

public class Usuario {
    private int dni;
    private String nombre;
    private String contraseña;
    private String rol;
    private String es_usuario;

    public Usuario() {
    }

    public Usuario(int dni, String nombre, String contraseña) {
        this.dni = dni;
        this.nombre = nombre;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getEs_usuario() {
        return es_usuario;
    }

    public void setEs_usuario(String es_usuario) {
        this.es_usuario = es_usuario;
    }
}
