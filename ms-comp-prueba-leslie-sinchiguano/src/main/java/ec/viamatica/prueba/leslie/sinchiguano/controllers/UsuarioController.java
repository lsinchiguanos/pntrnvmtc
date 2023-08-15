package ec.viamatica.prueba.leslie.sinchiguano.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.viamatica.prueba.leslie.sinchiguano.models.entity.Usuario;
import ec.viamatica.prueba.leslie.sinchiguano.models.service.UsuarioService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;
	
	@GetMapping()
	public ArrayList<Usuario> obtenerUsuarios(){
		return usuarioService.obtenerUsuario();
	}
	
	@GetMapping(name = "buscar")
	public ArrayList<Usuario> buscarUsuario(String cadena){
		return usuarioService.buscarUsuario(cadena);
	}
	
	@PostMapping()
	public Usuario registrarUsuario(@Valid @RequestBody Usuario usuario, BindingResult bindingResult) {
		return this.usuarioService.registrarUsuario(usuario);
	}
}
