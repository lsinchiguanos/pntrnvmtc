package ec.viamatica.prueba.leslie.sinchiguano.models.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.viamatica.prueba.leslie.sinchiguano.models.entity.Usuario;
import ec.viamatica.prueba.leslie.sinchiguano.models.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	@Autowired
	UsuarioRepository usuarioRepository;
	
	public ArrayList<Usuario> obtenerUsuario(){
		return (ArrayList<Usuario>) usuarioRepository.findAll();
	}
	
	public Usuario registrarUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
}
