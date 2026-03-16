package br.com.opala.EstudeX.controller;

import br.com.opala.EstudeX.entity.Contrato;
import br.com.opala.EstudeX.entity.Vigencia;
import br.com.opala.EstudeX.repository.ContratoRepository;
import br.com.opala.EstudeX.repository.VigenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vigencias")
public class VigenciaController
{
    @Autowired
    private VigenciaRepository repository;

    @GetMapping
    public List<Vigencia> listar() {return repository.findAll();}

    @PostMapping
    public Vigencia cadastrar(@RequestBody Vigencia vigencia)
    {
        return repository.save(vigencia);
    }
}
