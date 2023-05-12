package foro.alura.api1.topico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.print.attribute.standard.DateTimeAtCompleted;
import java.time.LocalDateTime;

@Table(name ="topicos2")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String status = "pendiente"; // inicializamos con el valor por defecto
    private String mensaje;
    private LocalDateTime fecha = LocalDateTime.now(); // inicializamos con el valor por defecto
    private Boolean activo;
    private String autor;
    @Enumerated(EnumType.STRING)
    private Curso curso;


    public Topico(DatosRegistroTopico datosRegistroTopico) {
        this.activo = true;
        this.titulo = datosRegistroTopico.titulo();
        this.mensaje = datosRegistroTopico.mensaje();
        this.autor = datosRegistroTopico.autor();
        this.curso = datosRegistroTopico.curso();
        if (datosRegistroTopico.status() != null && !datosRegistroTopico.status().isEmpty()) {
            this.status = datosRegistroTopico.status();
        }
        if (datosRegistroTopico.fecha() != null) {
            this.fecha = datosRegistroTopico.fecha();

        }
    }

    public void actualizarDatos(DatosActualizarTopico datosActualizarTopico) {
        if(datosActualizarTopico.titulo() != null){
            this.titulo = datosActualizarTopico.titulo();
        }



        if(datosActualizarTopico.mensaje() != null){
            this.mensaje = datosActualizarTopico.mensaje();

        }

        if(datosActualizarTopico.autor() != null){
            this.autor = datosActualizarTopico.autor();

        }
        /*
        if(datosActualizarTopico.curso() != null){
            this.curso = datosActualizarTopico.curso();

        }*/

        if(datosActualizarTopico.titulo() != null){
            this.status = datosActualizarTopico.status();

        }
        if(datosActualizarTopico.titulo() != null){
            this.fecha = datosActualizarTopico.fecha();

        }
    }

    public void desactivarTopico() {
        this.activo = false;
    }
}