package br.com.teamcubation.apifootball.repository;


import br.com.teamcubation.apifootball.model.Estadio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadioRepository extends JpaRepository<Estadio, Long> {
}
