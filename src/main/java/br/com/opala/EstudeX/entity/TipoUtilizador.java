package br.com.opala.EstudeX.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "TBL_TIPOUTILIZADOR")
public class TipoUtilizador
{
    @Id
    @Column(name = "idTipoUtilizador")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "cargo", length = 50)
    private String cargo;

    @OneToMany(mappedBy = "tipoUtilizador")
    @JsonIgnore private List<Utilizador> utilizadores;
}
