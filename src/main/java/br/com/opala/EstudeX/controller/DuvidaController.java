package br.com.opala.EstudeX.controller;

import br.com.opala.EstudeX.entity.Duvida;
import br.com.opala.EstudeX.repository.DuvidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/duvidas")
public class DuvidaController
{
    @Autowired
    private DuvidaRepository repository;

    @GetMapping
    public List<Duvida> listarDuvidas()
    {
        return repository.findAll();
    }//criar um get para busca de conteudo filtrado

    @GetMapping("/{id}")//melhor por outra coisa ao inves do id
    public Optional<Duvida> buscarDuvidaPorId(@PathVariable("id") Integer id)
    {
        var duvida = repository.findById(id);
        if(duvida.isPresent())
            return duvida;
        return null;
    }


    @PostMapping
    public Duvida criarDuvida(@RequestBody Duvida duvida)
    {
        return repository.save(duvida);
    }

}
