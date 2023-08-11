package ec.viamatica.prueba.leslie.sinchiguano.models.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ec.viamatica.prueba.leslie.sinchiguano.models.entity.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {

}
