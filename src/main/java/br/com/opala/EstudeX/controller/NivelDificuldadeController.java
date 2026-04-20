package br.com.opala.EstudeX.controller;

import br.com.opala.EstudeX.entity.NivelDificuldade;
import br.com.opala.EstudeX.repository.NivelDificuldadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class NivelDificuldadeController
{
    @Autowired
    private NivelDificuldadeRepository repository;

    @GetMapping
    public List<NivelDificuldade> listarDificuldades() {return repository.findAll();}

}
