package br.com.opala.EstudeX.repository;

import br.com.opala.EstudeX.entity.Comunicado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComunicadoRepository extends JpaRepository<Comunicado, Integer> {
}
