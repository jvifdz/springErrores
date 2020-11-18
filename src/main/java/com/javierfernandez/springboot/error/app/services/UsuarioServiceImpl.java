package com.javierfernandez.springboot.error.app.services;

import com.javierfernandez.springboot.error.app.models.domain.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private List<Usuario> lista;

    public UsuarioServiceImpl() {
        this.lista = new ArrayList<>();
        this.lista.add(new Usuario(1, "Andres", "Guzmán"));
        this.lista.add(new Usuario(2, "Javier", "ppp"));
        this.lista.add(new Usuario(3, "Pedro", "Gán"));
        this.lista.add(new Usuario(4, "Antonio", "uzmán"));
        this.lista.add(new Usuario(5, "Paco", "Guán"));
        this.lista.add(new Usuario(6, "Andresa", "umán"));
        this.lista.add(new Usuario(7, "Andrea", "án"));
    }

    @Override
    public List<Usuario> listar() {
        return this.lista;
    }

    @Override
    public Usuario obtenerPorId(Integer id) {

        Usuario resultado = null;
        for (Usuario u : this.lista) {
            if (u.getId().equals(id)) {
                resultado = u;
                break;
            }

        }
        return resultado;
    }

    @Override
    public Optional<Usuario> obtenerPorIdOptional(Integer id) {

        Usuario usuario= this.obtenerPorId(id);
        return Optional.ofNullable(usuario);
    }
}
