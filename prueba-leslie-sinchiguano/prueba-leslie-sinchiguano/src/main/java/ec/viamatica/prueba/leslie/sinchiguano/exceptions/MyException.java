package ec.viamatica.prueba.leslie.sinchiguano.exceptions;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.util.ArrayList;

@AllArgsConstructor
@Data
@Builder
public class MyException extends Exception {
    private int code;
    private String messages;
}
