package br.com.opala.EstudeX.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "TBL_CORRECAOREDACAO")
public class CorrecaoRedacao
{
    @Id
    @Column(name = "idCorrecaoRedacao")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCorrecaoRedacao;

    @Column(name = "PontuacaoObtida")
    private Float pontuacaoObtida;

    @Column(name = "DataResposta")
    private LocalDateTime dataResposta;

    @OneToOne
    @JoinColumn(name = "idRedacao")
    private Redacao redacao;

    @ManyToOne
    @JoinColumn(name = "idUtilizador")
    private Utilizador utilizador;
}
