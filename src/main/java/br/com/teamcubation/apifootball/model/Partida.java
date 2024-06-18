package br.com.teamcubation.apifootball.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class Partida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Clube clubeMandante;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Clube clubeVisitante;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Estadio estadio;

    @NotBlank
    private String resultado;

    @NotNull
    @FutureOrPresent
    private LocalDateTime dataHora;

    @NotNull
    private Integer golsMandante = 0;

    @NotNull
    private Integer golsVisitante = 0;
}
