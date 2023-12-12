package ec.viamatica.prueba.leslie.sinchiguano.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Map;

@Data
@AllArgsConstructor
@Builder
public class GenericResponse {
    Boolean status;
    Map<String, Object> table;
    Map<String, Object> errors;
}
