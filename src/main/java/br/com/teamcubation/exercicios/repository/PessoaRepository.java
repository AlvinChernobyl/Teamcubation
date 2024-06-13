package br.com.teamcubation.exercicios.repository;
import br.com.teamcubation.exercicios.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
