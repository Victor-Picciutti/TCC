package br.com.opala.EstudeX.controller;

import br.com.opala.EstudeX.entity.AtividadeResposta;
import br.com.opala.EstudeX.repository.AtividadeRespostaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/atividadesrespostas")
public class AtividadeRespostaController
{
    @Autowired
    private AtividadeRespostaRepository repository;

    @GetMapping
    public List<AtividadeResposta> listarRespostas() {return repository.findAll();}

    @PostMapping
    public AtividadeResposta criarRespostas(@RequestBody AtividadeResposta atividadeResposta)
    {
        return repository.save(atividadeResposta);
    }
}
