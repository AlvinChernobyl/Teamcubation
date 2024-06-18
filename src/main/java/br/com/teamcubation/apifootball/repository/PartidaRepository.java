
package br.com.teamcubation.apifootball.repository;

import br.com.teamcubation.apifootball.model.Partida;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface PartidaRepository extends JpaRepository<Partida, Long> {
    List<Partida> findByClubeMandanteIdOrClubeVisitanteId(Long clubeMandanteId, Long clubeVisitanteId);

    List<Partida> findByEstadioIdAndDataHoraBetween(Long estadioId, LocalDateTime start, LocalDateTime end);

    boolean existsByEstadioIdAndDataHoraBetween(Long id, LocalDateTime localDateTime, LocalDateTime localDateTime1);
}
