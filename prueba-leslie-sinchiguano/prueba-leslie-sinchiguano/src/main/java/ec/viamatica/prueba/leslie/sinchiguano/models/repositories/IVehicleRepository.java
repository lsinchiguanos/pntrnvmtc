package ec.viamatica.prueba.leslie.sinchiguano.models.repositories;

import ec.viamatica.prueba.leslie.sinchiguano.models.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVehicleRepository extends JpaRepository<Vehicle, Integer> {

}
