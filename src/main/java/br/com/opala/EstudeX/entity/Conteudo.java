package br.com.opala.EstudeX.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_CONTEUDO")
public class Conteudo
{
    @Id
    @Column(name = "idConteudo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "Titulo")
    private String titulo;

    @Column(name = "Texto")
    private String texto;

    @OneToOne
    @JoinColumn(name = "idDisciplina")
    private Disciplina disciplina;


}
