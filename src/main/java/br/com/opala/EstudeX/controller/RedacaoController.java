package br.com.opala.EstudeX.controller;

import br.com.opala.EstudeX.entity.Aluno;
import br.com.opala.EstudeX.entity.Atividade;
import br.com.opala.EstudeX.entity.Redacao;
import br.com.opala.EstudeX.repository.AlunoRepository;
import br.com.opala.EstudeX.repository.RedacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/redacoes")
public class RedacaoController
{
    @Autowired
    private RedacaoRepository repository;

    @GetMapping
    public List<Redacao> listarRedacoes()
    {
        return repository.findAll();
    }


    @GetMapping("/{id}")
    public Optional<Redacao> buscarRedacaoPorId(@PathVariable("id") Integer id)
    {
        var redacao = repository.findById(id);
        if(redacao.isPresent())
            return redacao;
        return null;
    }

    @PostMapping
    public Redacao postarRedacao(@RequestBody Redacao redacao)
    {
        return repository.save(redacao);
    }
}
