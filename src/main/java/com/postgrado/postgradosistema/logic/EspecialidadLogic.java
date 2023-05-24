package com.postgrado.postgradosistema.logic;

import com.postgrado.postgradosistema.dao.EspecialidadDao;
import com.postgrado.postgradosistema.modelo.Especialidad;

import javax.swing.*;
import java.util.List;

public class EspecialidadLogic {
    private EspecialidadDao especialidadDao = new EspecialidadDao();

    public boolean registrarEspecialidad(Especialidad especialidad) {
        try {
            return especialidadDao.registrarEspecialidad(especialidad);
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }

    public boolean modificarEspecialidad(Especialidad especialidad) {
        try {
            return especialidadDao.modificarEspecialidad(especialidad);
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }

    public boolean eliminarEspacialidad(Especialidad especialidad) {
        try {
            return especialidadDao.eliminarEspacialidad(especialidad);
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }

    public List<Especialidad> listaEspecialidades() {
        return especialidadDao.listaEspecialidades();
    }

    public List<Especialidad> buscarEspecialidadPorNombre(String nombre) {
        return especialidadDao.buscarEspecialidadPorNombre(nombre);
    }
}
