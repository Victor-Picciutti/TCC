package br.com.opala.EstudeX.controller;


//import br.com.opala.EstudeX.entity.RespostaDuvida;
import br.com.opala.EstudeX.entity.RespostaDuvida;
import br.com.opala.EstudeX.repository.RespostaDuvidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/respostas")
public class RespostaDuvidaController
{
    @Autowired
    private RespostaDuvidaRepository repository;

    @GetMapping
    public List<RespostaDuvida> listar()
    {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<RespostaDuvida> buscarPorId(@PathVariable("id") Integer id)
    {
        var Respostaduvida = repository.findById(id);
        if(Respostaduvida.isPresent())
            return Respostaduvida;
        return null;
    }
    @PostMapping
    public RespostaDuvida cadastrar(@RequestBody RespostaDuvida respostaDuvida)
    {
        return repository.save(respostaDuvida);
    }

    @PutMapping("/{id}")
    public RespostaDuvida alterar(@RequestBody RespostaDuvida respostaDuvida, @PathVariable Integer id)
    {
        if(id == respostaDuvida.getId() && buscarPorId(id).isPresent())
        {
            return repository.save(respostaDuvida);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Integer id)
    {
        var Respostaduvida = buscarPorId(id);
        if(Respostaduvida.isPresent())
        {
            repository.deleteById(id);
        }
    }
}

