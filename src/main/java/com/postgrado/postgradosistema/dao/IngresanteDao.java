package com.postgrado.postgradosistema.dao;

import com.postgrado.postgradosistema.configuracion.Conexion;
import com.postgrado.postgradosistema.modelo.*;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class IngresanteDao {
    Conexion cnxn = new Conexion();
    Connection cntn;
    PreparedStatement ps;
    ResultSet rs;

    public boolean registrarIngresante(Ingresante ingresante) {
        String sql = "INSERT INTO ingresante (dni, nombre, codigo, ciclo_id, especialidad_id," +
                " sede_id)" +
                " VALUES (?,?,?,?,?,?)";
        try {
            cntn = cnxn.getConnection();
            ps = cntn.prepareStatement(sql);
            ps.setString(1, ingresante.getDni());
            ps.setString(2, ingresante.getNombre());
            ps.setString(3, ingresante.getCodigo());
            ps.setInt(4, ingresante.getCiclo().getId());
            ps.setInt(5, ingresante.getEspecialidad().getId());
            ps.setInt(6, ingresante.getSede().getId());
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

    public boolean actualizarIngresante(Ingresante ingresante) {
        String sql = "UPDATE ingresante SET dni=?, nombre=?, codigo=?, ciclo_id=?, especialidad_id=?," +
                " sede_id=?" +
                " WHERE id=?";
        try {
            cntn = cnxn.getConnection();
            ps = cntn.prepareStatement(sql);
            ps.setString(1, ingresante.getDni());
            ps.setString(2, ingresante.getNombre());
            ps.setString(3, ingresante.getCodigo());
            ps.setInt(4, ingresante.getCiclo().getId());
            ps.setInt(5, ingresante.getEspecialidad().getId());
            ps.setInt(6, ingresante.getSede().getId());
            ps.setInt(7, ingresante.getId());
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

    public List<Ingresante> listaIngresantes() {
        List<Ingresante> ingresantes = new ArrayList<>();
        String sql = "SELECT\n" +
                "  ingresante.id,\n" +
                "  ingresante.dni,\n" +
                "  ingresante.nombre,\n" +
                "  ingresante.codigo,\n" +
                "  ciclo.nombre AS nombre_ciclo,\n" +
                "  especialidad.nombre AS nombre_especialidad,\n" +
                "  sede.nombre AS nombre_sede,\n" +
                "  ingresante.es_ingresante \n" +
                " FROM\n" +
                "  ingresante\n" +
                "  INNER JOIN ciclo ON ingresante.ciclo_id = ciclo.id\n" +
                "  INNER JOIN especialidad ON ingresante.especialidad_id = especialidad.id\n" +
                "  INNER JOIN sede ON ingresante.sede_id = sede.id"+
                "  ORDER BY ingresante.id DESC ;";
        try {
            cntn = cnxn.getConnection();
            ps = cntn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Ingresante ingresante = new Ingresante();
                ingresante.setId(rs.getInt("id"));
                ingresante.setDni(rs.getString("dni"));
                ingresante.setNombre(rs.getString("nombre"));
                ingresante.setCodigo(rs.getString("codigo"));
                ingresante.setCiclo(new Ciclo(rs.getString("nombre_ciclo")));
                ingresante.setEspecialidad(new Especialidad(rs.getString("nombre_especialidad")));
                ingresante.setSede(new Sede(rs.getString("nombre_sede")));
                ingresante.setEs_ingresante(rs.getString("es_ingresante"));
                ingresantes.add(ingresante);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return ingresantes;
    }

    public List<Ingresante> buscarIngresantePorNombre(String nombre) {
        List<Ingresante> ingresantes = new ArrayList<>();
        String sql = "SELECT\n" +
                "  ingresante.id,\n" +
                "  ingresante.dni,\n" +
                "  ingresante.nombre,\n" +
                "  ingresante.codigo,\n" +
                "  ciclo.nombre AS nombre_ciclo,\n" +
                "  especialidad.nombre AS nombre_especialidad,\n" +
                "  sede.nombre AS nombre_sede,\n" +
                "  ingresante.es_ingresante \n" +
                " FROM\n" +
                "  ingresante\n" +
                "  INNER JOIN ciclo ON ingresante.ciclo_id = ciclo.id\n" +
                "  INNER JOIN especialidad ON ingresante.especialidad_id = especialidad.id\n" +
                "  INNER JOIN sede ON ingresante.sede_id = sede.id\n" +
                " WHERE ingresante.nombre LIKE ?";
        try {
            cntn = cnxn.getConnection();
            ps = cntn.prepareStatement(sql);
            ps.setString(1, "%" + nombre + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                Ingresante ingresante = new Ingresante();
                ingresante.setId(rs.getInt("id"));
                ingresante.setDni(rs.getString("dni"));
                ingresante.setNombre(rs.getString("nombre"));
                ingresante.setCodigo(rs.getString("codigo"));
                ingresante.setCiclo(new Ciclo(rs.getString("nombre_ciclo")));
                ingresante.setEspecialidad(new Especialidad(rs.getString("nombre_especialidad")));
                ingresante.setSede(new Sede(rs.getString("nombre_sede")));
                ingresante.setEs_ingresante(rs.getString("es_ingresante"));
                ingresantes.add(ingresante);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return ingresantes;
    }

    public List<Ingresante> ingresantesPorProyecto(Proyecto proyecto) throws SQLException {
        List<Ingresante> ingresantes = new ArrayList<>();

        String sql = "SELECT i.id, i.dni, i.nombre, i.codigo, i.ciclo_id, i.especialidad_id, i.sede_id " +
                "FROM ingresante i " +
                "JOIN proyecto p ON i.proyecto_id = p.id " +
                "WHERE p.id = ?";

        try (Connection conn = cnxn.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, proyecto.getId());
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Ingresante ingresante = new Ingresante();
                    ingresante.setId(rs.getInt("id"));
                    ingresante.setDni(rs.getString("dni"));
                    ingresante.setNombre(rs.getString("nombre"));
                    ingresante.setCodigo(rs.getString("codigo"));
                    ingresante.setCiclo(new Ciclo(rs.getString("ciclo_id")));
                    ingresante.setEspecialidad(new Especialidad(rs.getString("especialidad_id")));
                    ingresante.setSede(new Sede(rs.getString("sede_id")));
                    ingresantes.add(ingresante);
                }
            }
        }
        return ingresantes;
    }

    public boolean eliminarIngresante(Ingresante ingresante) {

        String sql = "UPDATE ingresante SET es_ingresante='I' WHERE id = ?";
        try {
            cntn = cnxn.getConnection();
            ps = cntn.prepareStatement(sql);
            ps.setInt(1, ingresante.getId());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
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

    public List<Ingresante> ingresantes() {
        List<Ingresante> ingresantes = new ArrayList<>();
        String sql = "SELECT * FROM ingresante";
        try {
            cntn = cnxn.getConnection();
            ps = cntn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Ingresante ingresante = new Ingresante();
                ingresante.setId(rs.getInt("id"));
                ingresante.setDni(rs.getString("dni"));
                ingresante.setNombre(rs.getString("nombre"));
                ingresante.setCodigo(rs.getString("codigo"));
                ingresante.setCiclo(new Ciclo(rs.getInt("ciclo_id")));
                ingresante.setEspecialidad(new Especialidad(rs.getInt("especialidad_id")));
                ingresante.setSede(new Sede(rs.getInt("sede_id")));
                ingresantes.add(ingresante);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return ingresantes;
    }
}
