package ec.viamatica.prueba.leslie.sinchiguano.models.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import ec.viamatica.prueba.leslie.sinchiguano.models.entity.Usuario;
import ec.viamatica.prueba.leslie.sinchiguano.models.repositories.UsuarioRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Service
public class UsuarioService {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	private final String NUMERO_USUARIO="select t from usuario t where t.nombreUsuario = :nUsuario";
	private final String JSON_TEST= "{\r\n"
			+ "    \"user\":\"lemmar\",\r\n"
			+ "    \"email\":\"lemmar@gmail.com\",\r\n"
			+ "    \"pass\":\"admin123@\",\r\n"
			+ "    \"nopersona\":1\r\n"
			+ "}";
	Gson gson = new Gson().newBuilder().disableHtmlEscaping().setPrettyPrinting().serializeNulls().create();
	
	@PersistenceContext
	EntityManager entityManager;
	
	public ArrayList<Usuario> validarUsuario(String cadenaValidar){
		try {			
			Query query = entityManager.createQuery(NUMERO_USUARIO);
			query.setParameter(0, cadenaValidar);
			JsonObject jsonObject = gson.fromJson(JSON_TEST, JsonObject.class);
			String email = jsonObject.get("email").getAsString();
			ArrayList<Usuario> usuarios = (ArrayList<Usuario>) query.getResultList();
			for (Usuario usuario : usuarios) {
				usuario.get
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	
	public ArrayList<Usuario> obtenerUsuario(){
		return (ArrayList<Usuario>) usuarioRepository.findAll();
	}
	
	public ArrayList<Usuario> buscarUsuario(String cadena){
		return (ArrayList<Usuario>) usuarioRepository.findAll();
	}
	
	public Usuario registrarUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
}
