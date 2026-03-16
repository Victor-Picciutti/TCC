package br.com.opala.EstudeX.repository;


import br.com.opala.EstudeX.entity.Contrato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContratoRepository extends JpaRepository<Contrato, Integer> {
}
