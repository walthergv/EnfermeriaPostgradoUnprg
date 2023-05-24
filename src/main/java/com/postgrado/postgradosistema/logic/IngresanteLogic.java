package com.postgrado.postgradosistema.logic;

import com.postgrado.postgradosistema.dao.IngresanteDao;
import com.postgrado.postgradosistema.modelo.Ingresante;
import com.postgrado.postgradosistema.modelo.Proyecto;

import java.sql.SQLException;
import java.util.List;

public class IngresanteLogic {
    private IngresanteDao ingresanteDao = new IngresanteDao();

    public boolean registrarIngresante(Ingresante ingresante) {
        try {
            return ingresanteDao.registrarIngresante(ingresante);
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean actualizarIngresante(Ingresante ingresante) {
        try {
            return ingresanteDao.actualizarIngresante(ingresante);
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean eliminarIngresante(Ingresante ingresante) {
        return ingresanteDao.eliminarIngresante(ingresante);
    }

    public List<Ingresante> listaIngresantes() {
        return ingresanteDao.listaIngresantes();
    }

    public List<Ingresante> buscaringresantePorNombre(String nombre) {
        return ingresanteDao.buscarIngresantePorNombre(nombre);
    }

    public List<Ingresante> ingresantesPorProyecto(Proyecto proyecto) {
        try {
            return ingresanteDao.ingresantesPorProyecto(proyecto);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }
}
