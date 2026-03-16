package br.com.opala.EstudeX.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.type.descriptor.jdbc.VarbinaryJdbcType;

import java.security.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "TBL_VIGENCIAS")
public class Vigencia
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idVigencia")
    private Integer idVigencia;

    @ManyToOne
    @JoinColumn(name = "nroContrato")
    private Contrato contrato;

    @ManyToOne
    @JoinColumn(name = "idUtilizador")
    private Utilizador utilizador;

    @Column(name = "inVigencia")
    private LocalDateTime inVigencia;

    @Column(name = "fnVigencia")
    private LocalDateTime fnVigencia;

    @Column(name = "dcProrrogacao")
    private LocalDateTime dcProrrogacao;
}

