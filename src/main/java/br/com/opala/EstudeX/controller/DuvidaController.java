package br.com.opala.EstudeX.controller;

import br.com.opala.EstudeX.entity.Duvida;
import br.com.opala.EstudeX.repository.DuvidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/duvidas")
public class DuvidaController
{
    @Autowired
    private DuvidaRepository repository;

    @GetMapping
    public List<Duvida> listar()
    {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Duvida> buscarPorId(@PathVariable("id") Integer id)
    {
        var duvida = repository.findById(id);
        if(duvida.isPresent())
            return duvida;
        return null;
    }

    @PostMapping
    public Duvida cadastrar(@RequestBody Duvida duvida)
    {
        return repository.save(duvida);
    }

    @PutMapping("/{id}")
    public Duvida alterar(@RequestBody Duvida duvida, @PathVariable Integer id)
    {
        if(id == duvida.getIdDuvida() && buscarPorId(id).isPresent())
        {
            return repository.save(duvida);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Integer id)
    {
        var duvida = buscarPorId(id);
        if(duvida.isPresent())
        {
            repository.deleteById(id);
        }
    }
}
