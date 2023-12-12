package ec.viamatica.prueba.leslie.sinchiguano.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MessageUtil {
    OK("Proceso existoso", 200),
    SUCCESS("Registro almacenado con exito", 200),
    ERROR("Error al obtener informacion", 400),
    INTERNAL_ERROR("Ocurrio un error en el servidor", 500),
    JSONSCHEMA("No se pudo leer el formato JsonScjema", 409),
    NOT_FOUND("No existe existro", 404);

    private String message;
    private int code;
}
