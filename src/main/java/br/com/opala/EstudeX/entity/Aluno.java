package br.com.opala.EstudeX.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_ALUNO")
public class Aluno extends Utilizador
{
    @Id
    @Column(name = "idUtilizador")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "xp")
    private Integer xp;

    @ManyToOne
    @JoinColumn(name = "idSerie")
    private Serie serie;

}