package br.com.opala.EstudeX.controller;


//import br.com.opala.EstudeX.entity.RespostaDuvida;
import br.com.opala.EstudeX.entity.RespostaDuvida;
import br.com.opala.EstudeX.repository.RespostaDuvidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/respostas")
public class RespostaDuvidaController
{
    @Autowired
    private RespostaDuvidaRepository repository;

    @GetMapping
    public List<RespostaDuvida> listarRespostaDaDuvida()
    {
        return repository.findAll();
    }


    @PostMapping
    public RespostaDuvida responderDuvida(@RequestBody RespostaDuvida respostaDuvida)
    {
        return repository.save(respostaDuvida);
    }


}

