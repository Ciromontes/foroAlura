package foro.alura.api1.domain.topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DatosRegistroTopico(
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        String status,
        @NotBlank
        String autor,
        @NotNull
        Curso curso,

        LocalDateTime fecha)



{
}
