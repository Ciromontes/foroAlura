package foro.alura.api1.topico;

import java.time.LocalDateTime;

public record DatosListadoTopico(String titulo, String mensaje, LocalDateTime fecha, String status, String autor, String curso) {

    public DatosListadoTopico(Topico topico){
        this(topico.getTitulo(), topico.getMensaje(),  topico.getFecha(),topico.getStatus(),topico.getAutor(),topico.getCurso().toString()  );
    }
}
