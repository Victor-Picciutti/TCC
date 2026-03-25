package br.com.opala.EstudeX.controller;

import br.com.opala.EstudeX.entity.Atividade;
import br.com.opala.EstudeX.repository.AtividadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/atividades")
public class AtividadeController
{
    @Autowired
    private AtividadeRepository repository;

    @GetMapping
    public List<Atividade> listar() {return repository.findAll();}

    @PostMapping
    public Atividade cadastrar(@RequestBody Atividade atividade)
    {
        return repository.save(atividade);
    }
}
