package ec.viamatica.prueba.leslie.sinchiguano.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vhcl")
public class VehiculoController {

    @GetMapping
    public String obtenerVehiculos(){
        return null;
    }

    @GetMapping(value = "/dn")
    public String consultarVechiculoDuenyo(){
        return null;
    }

    @GetMapping(value = "/anyo")
    public String consultarVehiculoAnyo(){
        return null;
    }

    @GetMapping(value = "mtrcl")
    public String consultarVehiculoMatricula(){
        return null;
    }

}
