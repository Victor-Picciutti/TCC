package br.com.opala.EstudeX.controller;

import br.com.opala.EstudeX.entity.Aluno;
import br.com.opala.EstudeX.entity.Serie;
import br.com.opala.EstudeX.repository.SerieRepository;
import br.com.opala.EstudeX.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/series")
public class SerieController
{
    @Autowired
    private SerieRepository repository;

    @GetMapping
    public List<Serie> listar() {return repository.findAll();}

    @PostMapping
    public Serie cadastrar(@RequestBody Serie serie)
    {
        return repository.save(serie);
    }


}
