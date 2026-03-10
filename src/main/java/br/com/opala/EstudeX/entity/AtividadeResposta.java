/*package br.com.opala.EstudeX.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "TBL_ATIVIDADERESPOSTA")
public class AtividadeResposta
{
    @Id
    @Column(name = "idAtividade")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAtividade;

    @Column(name = "idAtividadeAluno")
    private Integer idAtividadeAluno;

    @Column(name = "momentoInicio")
    private Timestamp momentoInicio;

    @Column(name = "momentoFim")
    private Timestamp momentoFim;

    @Column(name = "pontuacao")
    private float pontucao;

    @ManyToOne
    @JoinColumn(name = "idAtividade")
    private Atividade atividade;
}
*/