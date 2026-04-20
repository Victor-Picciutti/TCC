package br.com.opala.EstudeX.controller;

import br.com.opala.EstudeX.entity.Atividade;
import br.com.opala.EstudeX.entity.AtividadePergunta;
import br.com.opala.EstudeX.repository.AtividadePerguntaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/atividadesPergunta")
public class AtividadePerguntaController
{
    @Autowired
    private AtividadePerguntaRepository repository;

    @GetMapping
    public List<AtividadePergunta> listarPerguntas() {return repository.findAll();}

    @PostMapping
    public AtividadePergunta CriarPergunta(@RequestBody AtividadePergunta atividadePergunta)
    {
        return repository.save(atividadePergunta);
    }


}
