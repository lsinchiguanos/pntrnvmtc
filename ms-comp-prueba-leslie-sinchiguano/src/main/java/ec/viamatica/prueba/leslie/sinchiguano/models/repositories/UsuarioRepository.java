package ec.viamatica.prueba.leslie.sinchiguano.models.repositories;

import org.springframework.data.repository.CrudRepository;
import ec.viamatica.prueba.leslie.sinchiguano.models.entity.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {

}
