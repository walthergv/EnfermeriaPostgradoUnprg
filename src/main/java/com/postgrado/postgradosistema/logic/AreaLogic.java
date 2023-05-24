package com.postgrado.postgradosistema.logic;

import com.postgrado.postgradosistema.dao.AreaDao;
import com.postgrado.postgradosistema.modelo.Area;

import javax.swing.*;
import java.util.List;

public class AreaLogic {
    private AreaDao areaDao = new AreaDao();

    public boolean registrarArea(Area area) {
        try {
            return areaDao.registrarArea(area);
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }

    public boolean modificarArea(Area area) {
        return areaDao.modificarArea(area);
    }

    public boolean inactivarArea(Area area) {
        return areaDao.inactivarArea(area);
    }

    public List<Area> listaAreas() {
        return areaDao.listaAreas();
    }

    public List<Area> buscarAreaPorNombre(String nombre) {
        return areaDao.buscarAreaPorNombre(nombre);
    }
}
