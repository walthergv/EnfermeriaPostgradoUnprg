package com.postgrado.postgradosistema.modelo;

public class Usuario {
    private int dni;
    private String nombre;
    private String contraseña;

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
}
