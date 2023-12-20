package ec.viamatica.prueba.leslie.sinchiguano.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NonNull;

@Data
public class MarcaDto {

    @NotNull(message = "Campo es requerido")
    @NotBlank(message = "Campo vacío")
    private String description;
}
