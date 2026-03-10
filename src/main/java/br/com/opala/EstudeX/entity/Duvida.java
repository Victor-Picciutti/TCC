package br.com.opala.EstudeX.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "TBL_DUVIDA")
public class Duvida
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDuvida")
    private Integer idDuvida;
    @Column(name = "Titulo")
    private String titulo;
    @Column(name = "Descricao")
    private String descricao;
    @Column(name = "Momento")
    private LocalDateTime momento;
    @Column(name = "StatusDuvida")
    private String statusDuvida;

    @ManyToOne
    @JoinColumn(name = "idUtilizador")
    private Utilizador utilizador;

    @OneToOne
    @JoinColumn(name = "idConteudo")
    private Conteudo conteudo;

}
