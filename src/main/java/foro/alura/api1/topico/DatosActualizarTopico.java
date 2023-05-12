package foro.alura.api1.topico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DatosActualizarTopico(@NotNull @Valid Long id, String titulo, String mensaje, LocalDateTime fecha, String status, String autor, String curso) {
}
