package com.postgrado.postgradosistema.logic;

import com.postgrado.postgradosistema.dao.ProyectoDao;
import com.postgrado.postgradosistema.modelo.Proyecto;

import javax.swing.*;
import java.sql.SQLException;
import java.util.List;

public class ProyectoLogic {
    private ProyectoDao proyectoDao = new ProyectoDao();

    public boolean registrarProyecto(Proyecto proyecto) {
        try {
            return proyectoDao.registrarProyecto(proyecto);
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean modificarProyecto(Proyecto proyecto) {
        try {
            return proyectoDao.modificarProyecto(proyecto);
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }

    }

    public boolean eliminarProyecto(Proyecto proyecto) {
        try {
            return proyectoDao.eliminarProyecto(proyecto);
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e.toString());
            return false;

        }
    }

    public List<Proyecto> listaProyectos() {
        try {
            return proyectoDao.listaProyectos();
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public List<Proyecto> buscarProyectoPorNombre(String nombre) {
        return proyectoDao.buscarProyectoPorTitulo(nombre);
    }

    public List<Proyecto> buscarProyectoPorAño(String año) {
        return proyectoDao.buscarProyectoPorAño(año);
    }


    public List<Proyecto> buscarProyectoPorId(int id) throws SQLException {
        return proyectoDao.buscarProyectoPorId(id);
    }
}
