package com.javierfernandez.springboot.error.app.services;

import com.javierfernandez.springboot.error.app.models.domain.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {

    public List<Usuario> listar();

    public Usuario obtenerPorId(Integer id);

    public Optional<Usuario> obtenerPorIdOptional(Integer id);
}
