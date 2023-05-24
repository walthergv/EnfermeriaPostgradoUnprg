package com.postgrado.postgradosistema.dao;

import com.postgrado.postgradosistema.configuracion.Conexion;
import com.postgrado.postgradosistema.modelo.Ciclo;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CicloDao {
    Conexion cnxn = new Conexion();
    Connection cntn;
    PreparedStatement ps;
    ResultSet rs;

    //Esta funcion registra Ciclos
    public boolean registrarCiclo(Ciclo ciclo) {
        String sql = "INSERT INTO ciclo (nombre) VALUES (?)";
        try {
            cntn = cnxn.getConnection();
            ps = cntn.prepareStatement(sql);
            ps.setString(1, ciclo.getNombre());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
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

    //FUNCION DE MODIFICA EL CICLO
    public boolean modificarCiclo(Ciclo ciclo) {
        String sql = "UPDATE ciclo SET nombre = ? WHERE id = ?";
        try {
            cntn = cnxn.getConnection();
            ps = cntn.prepareStatement(sql);
            ps.setString(1, ciclo.getNombre());
            ps.setInt(2, ciclo.getId());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
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

    public boolean eliminarCiclo(Ciclo ciclo) {
        String sql = "UPDATE ciclo SET es_ciclo='I' WHERE id = ?";
        try {
            cntn = cnxn.getConnection();
            ps = cntn.prepareStatement(sql);
            ps.setInt(1, ciclo.getId());
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

    //FUNCION QUE LISTA TODOS LOS CICLOS
    public List<Ciclo> listaCiclos() {
        List<Ciclo> ciclos = new ArrayList<>();
        String sql = "SELECT * FROM ciclo";
        try {
            cntn = cnxn.getConnection();
            ps = cntn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Ciclo ciclo = new Ciclo();
                ciclo.setId(rs.getInt("id"));
                ciclo.setNombre(rs.getString("nombre"));
                ciclo.setEs_ciclo(rs.getString("es_ciclo"));
                ciclos.add(ciclo);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        } finally {
            try {
                cntn.close();
            } catch (SQLException e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
        return ciclos;
    }

    public List<Ciclo> buscarCicloPorNombre(String nombre) {
        List<Ciclo> ciclos = new ArrayList<>();
        String sql = "SELECT * FROM ciclo WHERE nombre LIKE ?";
        try {
            cntn = cnxn.getConnection();
            ps = cntn.prepareStatement(sql);
            ps.setString(1, "%" + nombre + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                Ciclo ciclo = new Ciclo();
                ciclo.setId(rs.getInt("id"));
                ciclo.setNombre(rs.getString("nombre"));
                ciclo.setEs_ciclo(rs.getString("es_ciclo"));
                ciclos.add(ciclo);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        } finally {
            try {
                cntn.close();
            } catch (SQLException e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
        return ciclos;
    }
}
