package br.com.opala.EstudeX.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_NIVELDIFICULDADE")
public class NivelDificuldade
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idNivelDificuldade")
    private Integer idNivelDificuldade;

    @Column(name = "Nome")
    private String nome;

}
