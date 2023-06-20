package com.postgrado.postgradosistema.dao;

import com.postgrado.postgradosistema.configuracion.Conexion;
import com.postgrado.postgradosistema.modelo.Area;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
//
public class AreaDao {
    Conexion cnxn = new Conexion();
    Connection cntn;
    PreparedStatement ps;
    ResultSet rs;

    public boolean registrarArea(Area area) {
        String sql = "INSERT INTO area (nombre) VALUES (?)";
        try {
            cntn = cnxn.getConnection();
            ps = cntn.prepareStatement(sql);
            ps.setString(1, area.getNombre());

            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        } finally {
            try {
                cntn.close();
            } catch (Exception e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }

    public boolean modificarArea(Area area) {
        String sql = "UPDATE area SET nombre = ? WHERE id = ?";
        try {
            cntn = cnxn.getConnection();
            ps = cntn.prepareStatement(sql);
            ps.setString(1, area.getNombre());
            ps.setInt(2, area.getId());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        } finally {
            try {
                cntn.close();
            } catch (Exception e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }

    // Cambia el estado para "eliminar"
    public boolean inactivarArea(Area area) {
        String sql = "UPDATE area SET es_area = 'I' WHERE id = ?";
        try {
            cntn = cnxn.getConnection();
            ps = cntn.prepareStatement(sql);
            ps.setInt(1, area.getId());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        } finally {
            try {
                cntn.close();
            } catch (Exception e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }

    public List<Area> listaAreas() {
        List<Area> areas = new ArrayList<>();
        String sql = "SELECT * FROM area";
        try {
            cntn = cnxn.getConnection();
            ps = cntn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Area area = new Area();
                area.setId(rs.getInt("id"));
                area.setNombre(rs.getString("nombre"));
                area.setEs_area(rs.getString("es_area"));

                areas.add(area);
            }
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e.toString());
        } finally {
            try {
                cntn.close();
            } catch (Exception e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
        return areas;
    }

    public List<Area> buscarAreaPorNombre(String nombre) {
        List<Area> areas = new ArrayList<>();
        String sql = "SELECT * FROM area WHERE nombre LIKE ?";
        try {
            cntn = cnxn.getConnection();
            ps = cntn.prepareStatement(sql);
            ps.setString(1, "%" + nombre + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                Area area = new Area();
                area.setId(rs.getInt("id"));
                area.setNombre(rs.getString("nombre"));
                area.setEs_area(rs.getString("es_area"));
                areas.add(area);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            try {
                cntn.close();
            } catch (Exception e) {
                System.out.println(e.toString());
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
        return areas;
    }
}
