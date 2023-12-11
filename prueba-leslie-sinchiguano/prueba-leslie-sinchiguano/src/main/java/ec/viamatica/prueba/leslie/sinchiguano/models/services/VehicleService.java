package ec.viamatica.prueba.leslie.sinchiguano.models.services;

import ec.viamatica.prueba.leslie.sinchiguano.models.repositories.IVehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {

    @Autowired
    private IVehicleRepository iVehiculoRepository;


}
