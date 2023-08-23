package ec.viamatica.prueba.leslie.sinchiguano.models.services;

import ec.viamatica.prueba.leslie.sinchiguano.models.repositories.IVehiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehiculoService {

    @Autowired
    private IVehiculoRepository iVehiculoRepository;


}
