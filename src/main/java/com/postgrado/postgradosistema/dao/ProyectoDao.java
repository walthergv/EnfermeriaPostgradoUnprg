package com.postgrado.postgradosistema.dao;

import com.postgrado.postgradosistema.configuracion.Conexion;
import com.postgrado.postgradosistema.modelo.Especialidad;
import com.postgrado.postgradosistema.modelo.Ingresante;
import com.postgrado.postgradosistema.modelo.Proyecto;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProyectoDao {

    Conexion cnxn = new Conexion();
    Connection cntn;
    PreparedStatement ps;
    ResultSet rs;

    public boolean registrarProyecto(Proyecto proyecto) {
        String sql = "INSERT INTO proyecto (titulo, asesora, jurado, res_designacion, res_ejecucion, res_cambioJurado,res_cambioTitulo, res_sustentacion,  otros, especialidad_id, id_student, id_student2, id_student3) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            cntn = cnxn.getConnection();
            ps = cntn.prepareStatement(sql);
            ps.setString(1, proyecto.getTitulo());
            ps.setString(2, proyecto.getAsesora());
            ps.setString(3, proyecto.getJurado());
            ps.setString(4, proyecto.getRes_designacion());
            ps.setString(5, proyecto.getRes_ejecucion());
            ps.setString(6, proyecto.getRes_cambioJurado());
            ps.setString(7, proyecto.getRes_cambioTitulo());
            ps.setString(8, proyecto.getRes_sustentacion());
            ps.setString(9, proyecto.getOtros());
            ps.setInt(10, proyecto.getEspecialidad().getId());
            ps.setInt(11, proyecto.getIngresante1().getId());
            ps.setInt(12, proyecto.getIngresante2().getId());
            ps.setInt(13, proyecto.getIngresante3().getId());
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
            }
        }
    }

    /*comentario*/
    public boolean modificarProyecto(Proyecto proyecto) {
        String sql = "UPDATE proyecto SET titulo = ?, asesora = ?, jurado = ?, res_designacion = ?, res_ejecucion = ?, res_cambioJurado = ?, res_sustentacion = ?, res_cambioTitulo = ?, otros = ?, especialidad_id= ? id_student= ? id_student2= ? id_student3= ? WHERE id = ?";
        try {
            cntn = cnxn.getConnection();
            ps = cntn.prepareStatement(sql);
            ps.setString(1, proyecto.getTitulo());
            ps.setString(2, proyecto.getAsesora());
            ps.setString(3, proyecto.getJurado());
            ps.setString(4, proyecto.getRes_designacion());
            ps.setString(5, proyecto.getRes_ejecucion());
            ps.setString(6, proyecto.getRes_cambioJurado());
            ps.setString(7, proyecto.getRes_cambioTitulo());
            ps.setString(8, proyecto.getRes_sustentacion());
            ps.setString(9, proyecto.getOtros());
            ps.setInt(10, proyecto.getEspecialidad().getId());
            ps.setInt(11, proyecto.getIngresante1().getId());
            ps.setInt(12, proyecto.getIngresante2().getId());
            ps.setInt(13, proyecto.getIngresante3().getId());
            ps.setInt(14, proyecto.getId());
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

    public boolean eliminarProyecto(Proyecto proyecto) {
        String sql = "UPDATE proyecto SET es_proyecto = 'I'  WHERE id = ?";
        try {
            cntn = cnxn.getConnection();
            ps = cntn.prepareStatement(sql);
            ps.setInt(1, proyecto.getId());
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

    public List<Proyecto> listaProyectos() {
        List<Proyecto> proyectos = new ArrayList<>();

        String sql = "SELECT proyecto.id,"
                + " proyecto.titulo,"
                + " proyecto.es_proyecto,"
                + " proyecto.asesora,"
                + " proyecto.jurado,"
                + " proyecto.res_designacion,"
                + " proyecto.res_ejecucion,"
                + " proyecto.res_cambioJurado,"
                + " proyecto.res_sustentacion,"
                + " proyecto.res_cambioTitulo,"
                + " proyecto.otros,"
                + " proyecto.especialidad_id,"
                + " especialidad.nombre AS nombre_especialidad,"
                + " ingresante1.nombre AS nombre_estudiante1,"
                + " ingresante2.nombre AS nombre_estudiante2,"
                + " ingresante3.nombre AS  nombre_estudiante3"
                + " FROM proyecto"
                + " INNER JOIN especialidad ON proyecto.especialidad_id = especialidad.id"
                + " LEFT JOIN ingresante ingresante1 ON proyecto.id_student = ingresante1.id"
                + " LEFT JOIN ingresante ingresante2 ON proyecto.id_student2 = ingresante2.id"
                + " LEFT JOIN ingresante ingresante3 ON proyecto.id_student3 = ingresante3.id";

        try {
            cntn = cnxn.getConnection();
            ps = cntn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Proyecto proyecto = new Proyecto();
                proyecto.setId(rs.getInt("id"));
                proyecto.setIngresante1(new Ingresante(rs.getString("nombre_estudiante1")));
                proyecto.setIngresante2(new Ingresante(rs.getString("nombre_estudiante2")));
                proyecto.setIngresante3(new Ingresante(rs.getString("nombre_estudiante3")));
                proyecto.setTitulo(rs.getString("titulo"));
                proyecto.setAsesora(rs.getString("asesora"));
                proyecto.setJurado(rs.getString("jurado"));
                proyecto.setRes_designacion(rs.getString("res_designacion"));
                proyecto.setRes_ejecucion(rs.getString("res_ejecucion"));
                proyecto.setRes_cambioJurado(rs.getString("res_cambioJurado"));
                proyecto.setRes_sustentacion(rs.getString("res_sustentacion"));
                proyecto.setRes_cambioTitulo(rs.getString("res_cambioTitulo"));
                proyecto.setOtros(rs.getString("otros"));
                proyecto.setEspecialidad(new Especialidad(rs.getString("nombre_especialidad")));
                proyecto.setEs_proyecto(rs.getString("es_proyecto"));
                proyectos.add(proyecto);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return proyectos;
    }

    public List<Proyecto> buscarProyectoPorTitulo(String titulo) {
        List<Proyecto> proyectos = new ArrayList<>();
        String sql = "SELECT proyecto.id,"
                + " proyecto.titulo,"
                + " proyecto.es_proyecto,"
                + " proyecto.asesora,"
                + " proyecto.jurado,"
                + " proyecto.res_designacion,"
                + " proyecto.res_ejecucion,"
                + " proyecto.res_cambioJurado,"
                + " proyecto.res_sustentacion,"
                + " proyecto.res_cambioTitulo,"
                + " proyecto.otros,"
                + " proyecto.especialidad_id,"
                + " especialidad.nombre AS nombre_especialidad,"
                + " ingresante1.nombre AS nombre_estudiante1,"
                + " ingresante2.nombre AS nombre_estudiante2,"
                + " ingresante3.nombre AS  nombre_estudiante3"
                + " FROM proyecto"
                + " INNER JOIN especialidad ON proyecto.especialidad_id = especialidad.id"
                + " LEFT JOIN ingresante ingresante1 ON proyecto.id_student = ingresante1.id"
                + " LEFT JOIN ingresante ingresante2 ON proyecto.id_student2 = ingresante2.id"
                + " LEFT JOIN ingresante ingresante3 ON proyecto.id_student3 = ingresante3.id"
                + " LEFT proyecto.titulo LIKE ?";
        try {
            cntn = cnxn.getConnection();
            ps = cntn.prepareStatement(sql);
            ps.setString(1, "%" + titulo + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                Proyecto proyecto = new Proyecto();
                proyecto.setId(rs.getInt("id"));
                proyecto.setTitulo(rs.getString("titulo"));
                proyecto.setIngresante1(new Ingresante(rs.getString("nombre_estudiante1")));
                proyecto.setIngresante2(new Ingresante(rs.getString("nombre_estudiante2")));
                proyecto.setIngresante3(new Ingresante(rs.getString("nombre_estudiante3")));
                proyecto.setAsesora(rs.getString("asesora"));
                proyecto.setJurado(rs.getString("jurado"));
                proyecto.setRes_designacion(rs.getString("res_designacion"));
                proyecto.setRes_ejecucion(rs.getString("res_ejecucion"));
                proyecto.setRes_cambioJurado(rs.getString("res_cambioJurado"));
                proyecto.setRes_sustentacion(rs.getString("res_sustentacion"));
                proyecto.setRes_cambioTitulo(rs.getString("res_cambioTitulo"));
                proyecto.setOtros(rs.getString("otros"));
                proyecto.setEspecialidad(new Especialidad(rs.getString("nombre_especialidad")));
                proyecto.setEs_proyecto(rs.getString("es_proyecto"));
                proyectos.add(proyecto);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return proyectos;
    }

    public List<Proyecto> buscarProyectoPorAño(String año) {
        List<Proyecto> proyectos = new ArrayList<>();
        String sql = "SELECT proyecto.id, "
                + "proyecto.titulo, "
                + " ingresante.nombre AS nombre_ingresante1,"
                + " ingresante.nombre AS nombre_ingresante2,"
                + " ingresante.nombre AS nombre_ingresante3,"
                + "proyecto.es_proyecto"
                + " FROM proyecto"
                + " INNER JOIN ingresante ON proyecto.id_student = id_student"
                + " INNER JOIN ingresante ON proyecto.id_student2 = id_student2"
                + " INNER JOIN ingresante ON proyecto.id_student3 = id_studen3"
                + "proyecto.asesora, "
                + "proyecto.jurado, "
                + "proyecto.res_designacion, "
                + "proyecto.res_ejecucion, "
                + "proyecto.res_cambioJurado, "
                + "proyecto.res_sustentacion, "
                + "proyecto.res_cambioTitulo, "
                + "proyecto.otros, "
                + "especialidad.nombre AS nombre_especialidad, "
                + "proyecto.es_proyecto "
                + "FROM proyecto "
                + "INNER JOIN especialidad ON proyecto.especialidad_id = especialidad.id"
                + " WHERE proyecto.res_designacion LIKE ?";
        try {
            cntn = cnxn.getConnection();
            ps = cntn.prepareStatement(sql);
            ps.setString(1, "%" + año + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                Proyecto proyecto = new Proyecto();
                proyecto.setId(rs.getInt("id"));
                proyecto.setTitulo(rs.getString("titulo"));
                proyecto.setIngresante1(new Ingresante(rs.getString("nombre_ingresante1")));
                proyecto.setIngresante2(new Ingresante(rs.getString("nombre_ingresante2")));
                proyecto.setIngresante3(new Ingresante(rs.getString("nombre_ingresante3")));
                proyecto.setAsesora(rs.getString("asesora"));
                proyecto.setJurado(rs.getString("jurado"));
                proyecto.setRes_designacion(rs.getString("res_designacion"));
                proyecto.setRes_ejecucion(rs.getString("res_ejecucion"));
                proyecto.setRes_cambioJurado(rs.getString("res_cambioJurado"));
                proyecto.setRes_sustentacion(rs.getString("res_sustentacion"));
                proyecto.setRes_cambioTitulo(rs.getString("res_cambioTitulo"));
                proyecto.setOtros(rs.getString("otros"));
                proyecto.setEspecialidad(new Especialidad(rs.getString("nombre_especialidad")));
                proyecto.setEs_proyecto(rs.getString("es_proyecto"));
                proyectos.add(proyecto);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return proyectos;
    }

    public List<Proyecto> buscarProyectoPorId(int id) throws SQLException {
        List<Proyecto> proyectos = new ArrayList<>();
        String sql = "SELECT proyecto.id, "
                + "proyecto.titulo, "
                + " ingresante1.nombre AS nombre_ingresante1,"
                + " ingresante2.nombre AS nombre_ingresante2,"
                + " ingresante3.nombre AS nombre_ingresante3,"
                + " proyecto.es_proyecto"
                + " FROM proyecto"
                + " INNER JOIN ingresante ingresante1 ON proyecto.id_student = ingresante1.id_student"
                + " INNER JOIN ingresante ingresante2 ON proyecto.id_student2 = ingresante2.id_student2"
                + " INNER JOIN ingresante ingresante3 ON proyecto.id_student3 = ingresante3.id_student3"
                + " proyecto.asesora, "
                + "proyecto.jurado, "
                + "proyecto.res_designacion, "
                + "proyecto.res_ejecucion, "
                + "proyecto.res_cambioJurado, "
                + "proyecto.res_sustentacion, "
                + "proyecto.res_cambioTitulo, "
                + "proyecto.otros, "
                + "especialidad.nombre AS nombre_especialidad, "
                + "proyecto.es_proyecto "
                + "FROM proyecto "
                + "INNER JOIN especialidad ON proyecto.especialidad_id = especialidad.id "
                + "WHERE proyecto.titulo LIKE ?";
        try {
            cntn = cnxn.getConnection();
            ps = cntn.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                Proyecto newProyecto = new Proyecto();
                newProyecto.setId(rs.getInt("id"));
                newProyecto.setTitulo(rs.getString("titulo"));
                newProyecto.setIngresante1(new Ingresante(rs.getString("nombre_ingresante1")));
                newProyecto.setIngresante2(new Ingresante(rs.getString("nombre_ingresante2")));
                newProyecto.setIngresante3(new Ingresante(rs.getString("nombre_ingresante3")));
                newProyecto.setAsesora(rs.getString("asesora"));
                newProyecto.setJurado(rs.getString("jurado"));
                newProyecto.setRes_designacion(rs.getString("res_designacion"));
                newProyecto.setRes_ejecucion(rs.getString("res_ejecucion"));
                newProyecto.setRes_cambioJurado(rs.getString("res_cambioJurado"));
                newProyecto.setRes_sustentacion(rs.getString("res_sustentacion"));
                newProyecto.setRes_cambioTitulo(rs.getString("res_cambioTitulo"));
                newProyecto.setOtros(rs.getString("otros"));
                newProyecto.setEspecialidad(new Especialidad(rs.getString("nombre_especialidad")));
                newProyecto.setEs_proyecto(rs.getString("es_proyecto"));
                proyectos.add(newProyecto);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return proyectos;
    }

}
