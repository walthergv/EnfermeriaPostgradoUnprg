package com.postgrado.postgradosistema.dao;

import com.postgrado.postgradosistema.configuracion.Conexion;
import com.postgrado.postgradosistema.modelo.Sede;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SedeDao {
    Conexion cnxn = new Conexion();
    Connection cntn;
    PreparedStatement ps;
    ResultSet rs;

    public boolean registrarSede(Sede sede) {
        String sql = "INSERT INTO sede (nombre) VALUES (?)";
        try {
            cntn = cnxn.getConnection();
            ps = cntn.prepareStatement(sql);
            ps.setString(1, sede.getNombre());
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

    public boolean modificarSede(Sede sede) {
        String sql = "UPDATE sede SET nombre = ? WHERE id = ?";
        try {
            cntn = cnxn.getConnection();
            ps = cntn.prepareStatement(sql);
            ps.setString(1, sede.getNombre());
            ps.setInt(2, sede.getId());
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

    public boolean eliminarSede(Sede sede) {
        String sql = "UPDATE sede SET es_sede='I' WHERE id = ?";
        try {
            cntn = cnxn.getConnection();
            ps = cntn.prepareStatement(sql);
            ps.setInt(1, sede.getId());
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

    public List<Sede> listaSedes() {
        List<Sede> sedes = new ArrayList<>();
        String sql = "SELECT * FROM sede";
        try {
            cntn = cnxn.getConnection();
            ps = cntn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Sede sede = new Sede();
                sede.setId(rs.getInt("id"));
                sede.setNombre(rs.getString("nombre"));
                sede.setEs_sede(rs.getString("es_sede"));
                sedes.add(sede);
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
        return sedes;
    }

    public List<Sede> buscarSedePorNombre(String nombre) {
        List<Sede> sedes = new ArrayList<>();
        String sql = "SELECT * FROM sede WHERE nombre LIKE ?";
        try {
            cntn = cnxn.getConnection();
            ps = cntn.prepareStatement(sql);
            ps.setString(1, "%" + nombre + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                Sede sede = new Sede();
                sede.setId(rs.getInt("id"));
                sede.setNombre(rs.getString("nombre"));
                sede.setEs_sede(rs.getString("es_sede"));
                sedes.add(sede);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return sedes;
    }
}
