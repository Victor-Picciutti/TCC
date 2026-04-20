package br.com.opala.EstudeX.controller;

import br.com.opala.EstudeX.entity.Atividade;
import br.com.opala.EstudeX.repository.CorrecaoRedacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/correcaoRedacao")
public class CorrecaoRedacao
{
    @Autowired
    private CorrecaoRedacaoRepository repository;

    @GetMapping
    public List<br.com.opala.EstudeX.entity.CorrecaoRedacao> listarCorrecao() {return repository.findAll();}


}
