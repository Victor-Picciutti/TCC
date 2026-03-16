package br.com.opala.EstudeX.controller;

import br.com.opala.EstudeX.entity.Comunicado;

import br.com.opala.EstudeX.entity.Contrato;
import br.com.opala.EstudeX.repository.ContratoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contratos")
public class ContratoController
{
    @Autowired
    private ContratoRepository repository;

    @GetMapping
    public List<Contrato> listar() {return repository.findAll();}

    @PostMapping
    public Contrato cadastrar(@RequestBody Contrato contrato)
    {
                return repository.save(contrato);
    }
}
