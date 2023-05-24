package com.postgrado.postgradosistema.logic;

import com.postgrado.postgradosistema.dao.UsuarioDao;
import com.postgrado.postgradosistema.modelo.Usuario;

import java.util.List;

public class UsuarioLogic {
    UsuarioDao usuarioDao = new UsuarioDao();

    public boolean registrarUsuario(Usuario usuario) {
        try {
            return usuarioDao.registrarUsuario(usuario);
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public List<Usuario> listaUsuarios() {
        return usuarioDao.listaUsuarios();
    }

    public List<Usuario> buscarUsuarioPorNombre(String nombre) {
        return usuarioDao.buscarUsuarioPorNombre(nombre);
    }
}
