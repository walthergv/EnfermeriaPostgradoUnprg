package com.postgrado.postgradosistema.logic;

import com.postgrado.postgradosistema.dao.SedeDao;
import com.postgrado.postgradosistema.modelo.Sede;

import java.util.List;

public class SedeLogic {
    private SedeDao sedeDao = new SedeDao();

    public boolean registrarSede(Sede sede) {
        try {
            return sedeDao.registrarSede(sede);
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }

    }

    public boolean modificarSede(Sede sede) {
        try {
            return sedeDao.modificarSede(sede);
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }

    }

    public boolean eliminarSede(Sede sede) {
        try {
            return sedeDao.eliminarSede(sede);
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }

    }

    public List<Sede> listaSedes() {
        return sedeDao.listaSedes();
    }

    public List<Sede> buscarSedePorNombre(String nombre) {
        return sedeDao.buscarSedePorNombre(nombre);
    }
}
