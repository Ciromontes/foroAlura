package foro.alura.api1.controller;

import foro.alura.api1.topico.DatosRegistroTopico;
import foro.alura.api1.topico.Topico;
import foro.alura.api1.topico.TopicoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
