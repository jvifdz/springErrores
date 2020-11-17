package com.javierfernandez.springboot.error.app.services;

import com.javierfernandez.springboot.error.app.models.domain.Usuario;

import java.util.List;

public interface UsuarioService {

    public List<Usuario> listar();

    public Usuario obtenerPorId(Integer id);

}
