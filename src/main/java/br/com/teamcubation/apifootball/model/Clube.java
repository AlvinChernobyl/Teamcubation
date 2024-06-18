package br.com.teamcubation.apifootball.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDate;
@Data
@Entity
@Table(name = "clube")
public class Clube {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min = 2)
    @Column(nullable = false)
    private String nome;

    @NotBlank
    @Size(min = 2, max = 2)
    @Column(nullable = false, length = 2)
    private String estado;

    @NotNull
    @PastOrPresent
    @Column(nullable = false)
    private LocalDate dataCriacao;

    @Column(nullable = false)
    private boolean ativo;

    @PrePersist
    @PreUpdate
    public void validate() {
        if (!Estado.isValid(this.estado)) {
            throw new IllegalArgumentException("Estado inválido: " + this.estado);
        }
    }

}
