package br.com.opala.EstudeX.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_REDACAO")
public class Redacao
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idRedacao")
    private Integer idRedacao;

    @Column(name = "PontuacaoObtida")
    private Float pontuacaoObtida;

    @Column(name = "Comentarios")
    private String comentarios;

    @ManyToOne
    @JoinColumn(name = "idAluno")
    private Utilizador utilizador;
}
