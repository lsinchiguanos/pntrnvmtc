package ec.viamatica.prueba.leslie.sinchiguano.models.repositories;

import ec.viamatica.prueba.leslie.sinchiguano.models.entity.Marca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMarcaRepository extends JpaRepository<Marca, Integer> {
}
