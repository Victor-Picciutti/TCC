package br.com.opala.EstudeX.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_CRONOGRAMA")
public class Cronograma
{
    @Id
    @Column(name = "idCronograma")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "TituloCronograma")
    private String tituloCronograma;
}
