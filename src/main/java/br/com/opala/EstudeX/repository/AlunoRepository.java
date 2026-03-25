package br.com.opala.EstudeX.repository;

import br.com.opala.EstudeX.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AlunoRepository extends JpaRepository<Aluno, Integer>
{
    List<Aluno> findBySerie_Id(Integer idSerie);

    @Query("SELECT a FROM Aluno a WHERE a.serie.id = :idSerie")
    List<Aluno> buscarPorSerie(@Param("idSerie") Integer idSerie);
}