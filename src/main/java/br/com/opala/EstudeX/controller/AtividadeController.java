package br.com.opala.EstudeX.controller;

import br.com.opala.EstudeX.entity.Atividade;
import br.com.opala.EstudeX.entity.Utilizador;
import br.com.opala.EstudeX.repository.AtividadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/atividades")
public class AtividadeController
{
    @Autowired
    private AtividadeRepository repository;

    @GetMapping
    public List<Atividade> listarAtividade() {return repository.findAll();}

    @PostMapping
    public Atividade CriarAtividade(@RequestBody Atividade atividade)
    {
        return repository.save(atividade);
    }

    @GetMapping("/{id}")
    public Optional<Atividade> buscarAtividadePorId(@PathVariable("id") Integer id)
    {
        var atividade = repository.findById(id);
        if(atividade.isPresent())
            return atividade;
        return null;
    }
}
