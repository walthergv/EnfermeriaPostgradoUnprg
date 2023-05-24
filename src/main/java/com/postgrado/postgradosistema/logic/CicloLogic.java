package com.postgrado.postgradosistema.logic;

import com.postgrado.postgradosistema.dao.CicloDao;
import com.postgrado.postgradosistema.modelo.Ciclo;

import javax.swing.*;
import java.util.List;

public class CicloLogic {
    private static CicloDao cicloDao = new CicloDao();

    public boolean registrarCiclo(Ciclo ciclo) {
        try {
            return cicloDao.registrarCiclo(ciclo);
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }

    public boolean modificarCiclo(Ciclo ciclo) {
        try {
            return cicloDao.modificarCiclo(ciclo);
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }

    public boolean eliminarCiclo(Ciclo ciclo) {
        try {
            return cicloDao.eliminarCiclo(ciclo);
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }

    public List<Ciclo> listaCiclos() {
        return cicloDao.listaCiclos();
    }

    public List<Ciclo> buscarCicloPorNombre(String nombre) {
        return cicloDao.buscarCicloPorNombre(nombre);
    }
}
