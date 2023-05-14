package foro.alura.api1.controller;

import foro.alura.api1.topico.*;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/topicos")
public class TopicoController {
    @Autowired
    private TopicoRepository topicoRepository;
    @PostMapping
    public void registrarTopico(@RequestBody @Valid DatosRegistroTopico datosRegistroTopico) {
        /*System.out.println("el request llega correctamnete");
        System.out.println(parametro);*/
        topicoRepository.save(new Topico(datosRegistroTopico));
    }
    @GetMapping
    public Page<DatosListadoTopico> listadoTopico(@PageableDefault(size = 2) Pageable paginacion){
        return topicoRepository.findByActivoTrue(paginacion).map(DatosListadoTopico::new);
        //return topicoRepository.findAll(paginacion).map(DatosListadoTopico::new);
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity actualizarTopico(@RequestBody @Valid DatosActualizarTopico datosActualizarTopico,  @PathVariable Long id){
        //Topico topico = topicoRepository.getReferenceById(datosActualizarTopico.id());
        Topico topico = topicoRepository.getOne(id);
        topico.actualizarDatos(datosActualizarTopico);
        return ResponseEntity.ok(new DatosRespuestaTopico(topico.getId(), topico.getTitulo(),
                topico.getMensaje(), topico.getAutor(), topico.getCurso(), topico.getStatus(),topico.getFecha()));


    }
    //Delete Logico
    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity eliminarTopico(@PathVariable Long id){
        Topico topico = topicoRepository.getReferenceById(id);
        topico.desactivarTopico();
        return ResponseEntity.noContent().build();

    }
/*  //Delete en base de datos
    @DeleteMapping("/{id}")
    @Transactional
    public void eliminarTopico(@PathVariable Long id){
        Topico topico = topicoRepository.getReferenceById(id);
        topicoRepository.delete(topico);

    }*/
}
