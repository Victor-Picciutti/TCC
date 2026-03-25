package br.com.opala.EstudeX.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "TBL_SERIE")
public class Serie
{
    @Id
    @Column(name = "idSerie")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NomeSerie")
    private String nomeSerie;

    @Column(name = "Inicio")
    private LocalDate inicio;

    @OneToMany(mappedBy = "serie")
    @JsonIgnore
    private List<Aluno> alunos;

    @OneToMany(mappedBy = "serie")
    @JsonIgnore
    private List<Comunicado> comunicados;


}
