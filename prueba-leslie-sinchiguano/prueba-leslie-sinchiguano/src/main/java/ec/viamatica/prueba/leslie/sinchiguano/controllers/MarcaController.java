package ec.viamatica.prueba.leslie.sinchiguano.controllers;

import ec.viamatica.prueba.leslie.sinchiguano.dtos.MarcaDto;
import ec.viamatica.prueba.leslie.sinchiguano.models.services.MarcaService;
import jakarta.validation.Valid;
import org.slf4j.ILoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
@RequestMapping("/mrc")
public class MarcaController {

    @Autowired
    MarcaService marcaService;

    @PostMapping(value = "/nwmrc", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public String newMarca(@Valid @RequestBody MarcaDto marcaDto){
        return marcaService.newMarca(marcaDto);
    }
}
