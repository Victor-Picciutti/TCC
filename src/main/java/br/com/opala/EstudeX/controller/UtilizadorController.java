package br.com.opala.EstudeX.controller;

import br.com.opala.EstudeX.entity.Utilizador;
import br.com.opala.EstudeX.repository.UtilizadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/utilizadores")
public class UtilizadorController
{
    @Autowired
    private UtilizadorRepository repository;

    @GetMapping
    public List<Utilizador> listarUtilizadores()
    {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Utilizador> buscarUtilizadorPorId(@PathVariable("id") Integer id)
    {
        var utilizador = repository.findById(id);
        if(utilizador.isPresent())
            return utilizador;
        return null;
    }

    @PostMapping
    public Utilizador cadastrarUtilizador(@RequestBody Utilizador utilizador)
    {
        return repository.save(utilizador);
    }


}
