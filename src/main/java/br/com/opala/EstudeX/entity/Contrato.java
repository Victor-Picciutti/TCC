package br.com.opala.EstudeX.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "TBL_CONTRATO")
public class Contrato
{
    @Id
    @Column(name = "nroContrato")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer nroContrato;

    @Column(name = "dcContrato")
    private Timestamp dcContrato;

    @Column(name = "daContrato")
    private Timestamp daContrato;

    @Column(name = "StatusContrato", length = 50, columnDefinition = "CHAR(50)")
    private String statusContrato;

    @Column(name = "UtilizadorResponsavel")
    private String UtilizadorResponsavel;

}
