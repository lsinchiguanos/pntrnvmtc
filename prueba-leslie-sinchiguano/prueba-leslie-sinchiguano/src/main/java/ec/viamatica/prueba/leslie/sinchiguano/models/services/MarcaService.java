package ec.viamatica.prueba.leslie.sinchiguano.models.services;


import com.google.gson.Gson;
import ec.viamatica.prueba.leslie.sinchiguano.dtos.MarcaDto;
import ec.viamatica.prueba.leslie.sinchiguano.models.repositories.IMarcaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MarcaService {

    @Autowired
    IMarcaRepository marcaRepository;



    public String newMarca(MarcaDto dataMarca){
        log.info("Value is: {}", dataMarca);
        //marcaRepository.save(dataMarca);
        return String.valueOf('{}');
    }
}
