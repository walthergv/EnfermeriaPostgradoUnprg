package com.postgrado.postgradosistema.dao;

import com.postgrado.postgradosistema.configuracion.Conexion;
import com.postgrado.postgradosistema.modelo.Area;
import com.postgrado.postgradosistema.modelo.Especialidad;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EspecialidadDao {
    Conexion cnxn = new Conexion();
    Connection cntn;
    PreparedStatement ps;
    ResultSet rs;

    public boolean registrarEspecialidad(Especialidad especialidad) {
        String sql = "INSERT INTO especialidad (nombre, area_id) VALUES (?,?)";
        try {
            cntn = cnxn.getConnection();
            ps = cntn.prepareStatement(sql);
            ps.setString(1, especialidad.getNombre());
            ps.setInt(2, especialidad.getArea().getId());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        } finally {
            try {
                cntn.close();
            } catch (SQLException e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }

    public boolean modificarEspecialidad(Especialidad especialidad) {
        String sql = "UPDATE especialidad SET nombre = ?, area_id = ? WHERE id = ?";
        try {
            cntn = cnxn.getConnection();
            ps = cntn.prepareStatement(sql);
            ps.setString(1, especialidad.getNombre());
            ps.setInt(2, especialidad.getArea().getId());
            ps.setInt(3, especialidad.getId());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        } finally {
            try {
                cntn.close();
            } catch (SQLException e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }

    public boolean eliminarEspacialidad(Especialidad especialidad) {
        String sql = "UPDATE especialidad SET es_especialidad ='I' WHERE id = ?";
        try {
            cntn = cnxn.getConnection();
            ps = cntn.prepareStatement(sql);
            ps.setInt(1, especialidad.getId());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        } finally {
            try {
                cntn.close();
            } catch (SQLException e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }

    public List<Especialidad> listaEspecialidades() {
        List<Especialidad> especialidades = new ArrayList<>();
        String sql = "SELECT" +
                " especialidad.id, " +
                "especialidad.nombre, " +
                "area.nombre AS nombre_area, " +
                "especialidad.es_especialidad " +
                "FROM especialidad " +
                " INNER JOIN area ON especialidad.area_id = area.id";
        try {
            cntn = cnxn.getConnection();
            ps = cntn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Especialidad especialidad = new Especialidad();
                especialidad.setId(rs.getInt("id"));
                especialidad.setNombre(rs.getString("nombre"));
                especialidad.setArea(new Area(rs.getString("nombre_area")));
                especialidad.setEs_especialidad(rs.getString("es_especialidad"));
                especialidades.add(especialidad);
            }
        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return especialidades;
    }

    public List<Especialidad> buscarEspecialidadPorNombre(String nombre) {
        List<Especialidad> especialidades = new ArrayList<>();
        String sql = "SELECT" +
                " especialidad.id, " +
                "especialidad.nombre, " +
                "area.nombre AS nombre_area, " +
                "especialidad.es_especialidad " +
                "FROM especialidad " +
                " INNER JOIN area ON especialidad.area_id = area.id"
                + " WHERE especialidad.nombre LIKE ?";
        try {
            cntn = cnxn.getConnection();
            ps = cntn.prepareStatement(sql);
            ps.setString(1, "%" + nombre + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                Especialidad especialidad = new Especialidad();
                especialidad.setId(rs.getInt("id"));
                especialidad.setNombre(rs.getString("nombre"));
                especialidad.setArea(new Area(rs.getString("nombre_area")));
                especialidad.setEs_especialidad(rs.getString("es_especialidad"));
                especialidades.add(especialidad);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return especialidades;
    }

    public List<Especialidad> especialidades() {
        List<Especialidad> especialidades = new ArrayList<>();
        String sql = "SELECT * FROM especialidad";
        try {
            cntn = cnxn.getConnection();
            ps = cntn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Especialidad especialidad = new Especialidad();
                especialidad.setId(rs.getInt("id"));
                especialidad.setNombre(rs.getString("nombre"));
                especialidades.add(especialidad);
            }
        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e.toString());
        } finally {
            try {
                cntn.close();
            } catch (SQLException e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
        return especialidades;
    }
}
