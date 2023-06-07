package com.postgrado.postgradosistema.dao;

import com.postgrado.postgradosistema.configuracion.Conexion;
import com.postgrado.postgradosistema.modelo.Usuario;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDao {
    Conexion cnxn = new Conexion();
    Connection cntn;
    PreparedStatement ps;
    ResultSet rs;

    public boolean registrarUsuario(Usuario usuario) {
        String sql = "INSERT INTO usuario (dni, nombre, contraseña, rol) VALUES (?,?,?,?)";
        try {
            cntn = cnxn.getConnection();
            ps = cntn.prepareStatement(sql);
            ps.setInt(1, usuario.getDni());
            ps.setString(2, usuario.getNombre());
            ps.setString(3, usuario.getContraseña());
            ps.setString(4, usuario.getRol());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e);
            return false;
        } finally {
            try {
                cntn.close();
            } catch (Exception e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
    public boolean modificarUsuario(Usuario usuario) {
        String sql = "UPDATE usuario SET nombre = ?, contraseña = ?, rol = ? WHERE dni = ?";
        try {
            cntn = cnxn.getConnection();
            ps = cntn.prepareStatement(sql);
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getContraseña());
            ps.setString(3, usuario.getRol());
            ps.setInt(4, usuario.getDni());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e);
            return false;
        } finally {
            try {
                cntn.close();
            } catch (Exception e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
    public boolean eliminarUsuario(Usuario usuario){
        String sql = "Update usuario SET es_usuario = 'I' WHERE dni = ?";
        try {
            cntn = cnxn.getConnection();
            ps = cntn.prepareStatement(sql);
            ps.setInt(1, usuario.getDni());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e);
            return false;
        } finally {
            try {
                cntn.close();
            } catch (Exception e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
    public List<Usuario> listaUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        String sql = "SELECT dni, nombre, contraseña, rol, es_usuario FROM usuario";
        try {
            cntn = cnxn.getConnection();
            ps = cntn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setDni(rs.getInt("dni"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setContraseña(rs.getString("contraseña"));
                usuario.setRol(rs.getString("rol"));
                usuario.setEs_usuario(rs.getString("es_usuario"));
                usuarios.add(usuario);
            }
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                cntn.close();
            } catch (Exception e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(null, e);
            }
        }
        return usuarios;
    }

    public List<Usuario> buscarUsuarioPorNombre(String nombre) {
        List<Usuario> usuarios = new ArrayList<>();
        String sql = "SELECT dni, nombre, contraseña,  rol, es_usuario FROM usuario WHERE nombre LIKE ?";
        try {
            cntn = cnxn.getConnection();
            ps = cntn.prepareStatement(sql);
            ps.setString(1, "%" + nombre + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setDni(rs.getInt("dni"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setContraseña(rs.getString("contraseña"));
                usuario.setEs_usuario(rs.getString("es_usuario"));
                usuario.setRol(rs.getString("rol"));
                usuarios.add(usuario);
            }
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                cntn.close();
            } catch (Exception e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(null, e);
            }
        }
        return usuarios;
    }

    public Usuario loginUsuario(int dni, String password) {
        Usuario usuario = new Usuario();
        String sql = "SELECT * FROM usuario WHERE dni=? AND contraseña=?";
        try {
            cntn = cnxn.getConnection();
            ps = cntn.prepareStatement(sql);
            ps.setInt(1, dni);
            ps.setString(2, password);
            rs = ps.executeQuery();

            while (rs.next()) {
                usuario.setDni(rs.getInt("dni"));
                usuario.setContraseña(rs.getString("contraseña"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setRol(rs.getString("rol"));
                usuario.setEs_usuario(rs.getString("es_usuario"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        } finally {
            try {
                cntn.close();
            } catch (Exception e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(null, e);
            }
        }
        return usuario;
    }
}
