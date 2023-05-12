package foro.alura.api1.controller;

import foro.alura.api1.topico.DatosListadoTopico;
import foro.alura.api1.topico.DatosRegistroTopico;
import foro.alura.api1.topico.Topico;
import foro.alura.api1.topico.TopicoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public List<DatosListadoTopico> listadoTopico(){
        return topicoRepository.findAll().stream().map(DatosListadoTopico::new).toList();
    }
}
