package ec.viamatica.prueba.leslie.sinchiguano.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class BodyGenericResponse {
    String _code;
    String _msg;
}
