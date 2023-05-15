package foro.alura.api1.domain.topico;

import java.time.LocalDateTime;

public record DatosRespuestaTopico(Long id, String titulo, String mensaje, String fecha,
                                   Curso status, String autor, LocalDateTime curso) {
}
