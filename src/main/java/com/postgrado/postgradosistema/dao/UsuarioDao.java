package com.postgrado.postgradosistema.dao;

import com.postgrado.postgradosistema.configuracion.Conexion;
import com.postgrado.postgradosistema.modelo.Usuario;

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
        String sql = "INSERT INTO usuario (dni, nombre, contraseña) VALUES (?,?,?)";
        try {
            cntn = cnxn.getConnection();
            ps = cntn.prepareStatement(sql);
            ps.setInt(1, usuario.getDni());
            ps.setString(2, usuario.getNombre());
            ps.setString(3, usuario.getContraseña());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        } finally {
            try {
                cntn.close();
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
    }

    public List<Usuario> listaUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        String sql = "SELECT dni, nombre FROM usuario";
        try {
            cntn = cnxn.getConnection();
            ps = cntn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setDni(rs.getInt("dni"));
                usuario.setNombre(rs.getString("nombre"));
                usuarios.add(usuario);
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                cntn.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return usuarios;
    }

    public List<Usuario> buscarUsuarioPorNombre(String nombre) {
        List<Usuario> usuarios = new ArrayList<>();
        String sql = "SELECT dni, nombre FROM usuario WHERE nombre LIKE ?";
        try {
            cntn = cnxn.getConnection();
            ps = cntn.prepareStatement(sql);
            ps.setString(1, "%" + nombre + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setDni(rs.getInt("dni"));
                usuario.setNombre(rs.getString("nombre"));
                usuarios.add(usuario);
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                cntn.close();
            } catch (Exception e) {
                System.out.println(e);
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
            return null;
        } finally {
            try {
                cntn.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return usuario;
    }
}
