package br.com.teamcubation.apifootball.repository;

import br.com.teamcubation.apifootball.model.Clube;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface ClubeRepository extends JpaRepository<Clube, Long> {
    Optional<Clube> findByNomeAndEstado(String nome, String estado);
}
