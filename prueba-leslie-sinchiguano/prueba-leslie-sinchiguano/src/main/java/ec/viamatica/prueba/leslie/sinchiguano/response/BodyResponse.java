package ec.viamatica.prueba.leslie.sinchiguano.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class BodyResponse {
    String _code;
    String _msg;
}
